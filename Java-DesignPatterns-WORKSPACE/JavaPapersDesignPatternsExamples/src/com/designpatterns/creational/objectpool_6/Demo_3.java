package com.designpatterns.creational.objectpool_6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo_3 {

	public static void main(String args[]) {

		// Create the ConnectionPool:
		JDBCConnectionPool_2 pool = new JDBCConnectionPool_2("com.ibm.db2.jcc.DB2Driver",
				"jdbc:db2://axudbpmtdev001:64100/ASTDB:", "s0998hf1", "Shardu@1990");

		// Get a connection:
		Connection con = pool.checkOut();
		Statement stmt = null;
		try {
			stmt = con.createStatement();

			String sql;
			sql = "select project_id,name from db2apps.UAP_PROJECTS fetch first 5 rows only";

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String pid = rs.getString("project_id");
				String pName = rs.getString("name");
				System.out.println("PID : " + pid + " , Name : " + pName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// Return the connection:
			pool.checkIn(con);
		}
	}
}