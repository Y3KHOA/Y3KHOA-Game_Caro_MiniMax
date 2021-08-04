/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketnoisql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dell
 */
public class ketnoi {
    private static Connection con;
    public static Connection getConnection() {
        try {            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con  = DriverManager.getConnection("jdbc:sqlserver://ADMINISTRATIONK\\SQLEXPRESS:1433;user=sa;password=sa2020;database=dndk");
        } catch (Exception e) {
                System.out.println("Connect Error");
        }
        return con;
    }
    
}
