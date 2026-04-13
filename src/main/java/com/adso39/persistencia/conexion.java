/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adso39.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SENA
 */
public class conexion {
    
    private static final String JDBC_URL = "jdbc:mariadb://localhost:3306/usuarios_db";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection() throws SQLException {
    
        return DriverManager.getConnection(
                JDBC_URL, USER, PASSWORD
        );
    
    }
    
    
    
    
    
    
    
}
