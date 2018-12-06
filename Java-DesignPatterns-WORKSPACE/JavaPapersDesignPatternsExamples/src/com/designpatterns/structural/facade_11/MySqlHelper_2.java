package com.designpatterns.structural.facade_11;

import java.sql.Connection;

public class MySqlHelper_2 {
	public static Connection getMySqlDBConnection() {
		// get MySql DB connection using connection parameters
		System.out.println("MySqlHelper_2.getMySqlDBConnection()");
		return null;
	}

	public void generateMySqlPDFReport(String tableName, Connection con) {
		System.out.println("MySqlHelper_2.generateMySqlPDFReport()");
		// get data from table and generate pdf report
	}

	public void generateMySqlHTMLReport(String tableName, Connection con) {
		System.out.println("MySqlHelper_2.generateMySqlHTMLReport()");
		// get data from table and generate pdf report
	}
}
