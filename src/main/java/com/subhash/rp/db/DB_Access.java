/**
 * 
 */
package com.subhash.rp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Subhash
 *
 */
public class DB_Access {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try
		{
			ArrayList<String> urls = new ArrayList<String>();
			String q1 = "select * from pdf_source";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ai_recruitment","root","");
			Statement stmt1 = con.createStatement();
			ResultSet rs = stmt1.executeQuery(q1);
			while(rs.next())
				//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				urls.add(rs.getString("url"));
				//stmt2.executeQuery(q2);
				System.out.println(urls);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
