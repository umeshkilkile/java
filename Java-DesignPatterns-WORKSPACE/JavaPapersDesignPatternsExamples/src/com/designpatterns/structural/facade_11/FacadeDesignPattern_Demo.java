package com.designpatterns.structural.facade_11;

import java.sql.Connection;

public class FacadeDesignPattern_Demo {
	public static void main(String[] args) {
		String tableName = "Employee";

		/*
		 * Generating MySql HTML report and Oracle PDF report without using
		 * Facade
		 */
		Connection con = MySqlHelper_2.getMySqlDBConnection();
		MySqlHelper_2 mySqlHelper = new MySqlHelper_2();
		mySqlHelper.generateMySqlHTMLReport(tableName, con);

		Connection con1 = OracleHelper_1.getOracleDBConnection();
		OracleHelper_1 oracleHelper = new OracleHelper_1();
		oracleHelper.generateOraclePDFReport(tableName, con1);

		/*
		 * Generating MySql HTML report and Oracle PDF report using Facade
		 */
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
	}
}
