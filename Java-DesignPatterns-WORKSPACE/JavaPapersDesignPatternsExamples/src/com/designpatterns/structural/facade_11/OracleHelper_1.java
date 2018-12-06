package com.designpatterns.structural.facade_11;

import java.sql.Connection;

public class OracleHelper_1 {
	public static Connection getOracleDBConnection() {
		// get Oracle DB connection using connection parameters
		System.out.println("OracleHelper_1.getOracleDBConnection()");
		return null;
	}

	public void generateOraclePDFReport(String tableName, Connection con) {
		System.out.println("OracleHelper_1.generateOraclePDFReport()");
		// get data from table and generate pdf report
	}

	public void generateOracleHTMLReport(String tableName, Connection con) {
		System.out.println("OracleHelper_1.generateOracleHTMLReport()");
		// get data from table and generate pdf report
	}
}
