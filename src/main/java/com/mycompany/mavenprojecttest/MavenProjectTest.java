/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenprojecttest;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author shithilboss
 */
public class MavenProjectTest {
    
    private final String HOSTNAME = "shithilboss-Satellite-L840";
    private final String USERNAME = "root";
    private final String PASSWORD = "000";
    private final String DBNAME = "predictdb";
    private final String DBURL ="jdbc:mysql://" + HOSTNAME +"/" + DBNAME;

    public MavenProjectTest() {
        
        try {
            Connection connection = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            System.out.println("connected");
        } catch (SQLException ex) {
            Logger.getLogger(MavenProjectTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public static void  main (String[]args){
        
        
}
    
}
