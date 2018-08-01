package com.schedule.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestABCD {
	
	public static void main (String[] args) {
		
		Connection conn = null;
        try {
            String url = "jdbc:sqlite:sample.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
            
            String query = "select * from users";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
            	System.out.println(rs.getString(1) + " " + rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
	}
}
