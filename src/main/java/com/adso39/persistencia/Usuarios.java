/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adso39.persistencia;

import com.adso39.modelos.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SENA
 */
public class Usuarios {
    
    private Connection laConexion;
    
    public Usuarios () {
        try {
            
            this.laConexion = conexion.getConnection();
            
        }
    
        catch (SQLException e) {
    
        System.out.println(e.getMessage());
    
        }
    
    }  
    
    public boolean registrarUsuario(Usuario elUsuario) {
    
        String sql = "INSERT INTO usuarios" +
                "(identificacion, nombres, apellidos," +
                " indiceCargo, textoCargo, esAdministrador) " +
                "VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
        
            PreparedStatement ptsmt = laConexion.prepareStatement(sql);
            
            ptsmt.setString(1, elUsuario.getIdentificacion());
            ptsmt.setString(2, elUsuario.getNombres());
            ptsmt.setString(3, elUsuario.getApellidos());
            ptsmt.setInt(4, elUsuario.getIndiceCargo());
            ptsmt.setString(5, elUsuario.getTextoCargo());
            ptsmt.setBoolean(6, elUsuario.isEsAdministrador());
            
            
            int affectedRows = ptsmt.executeUpdate();
            return affectedRows > 0;
            
        } catch (SQLException e) {
        
            System.out.println("Error al registrar el usuario: " + e.getMessage());
            return false;
        } 
        
    }
    
    public ArrayList<Usuario> consultarUsuarios (){
        ArrayList<Usuario> losUsuarios = new ArrayList();
        String sql = "SELECT * FROM usuarios";
        try {
            PreparedStatement pstmt = laConexion.prepareStatement(sql);
            
            ResultSet resultado = pstmt.executeQuery();
            while (resultado.next()) {
                Usuario registrado = new Usuario();
                registrado.setIdentificacion(resultado.getString("identificacion"));
                registrado.setNombres(resultado.getString("nombres"));
                registrado.setApellidos(resultado.getString("apellidos"));
                registrado.setIndiceCargo(resultado.getInt("indiceCargo"));
                registrado.setTextoCargo(resultado.getString("textoCargo"));
                registrado.setEsAdministrador(resultado.getBoolean("esAdministrador"));
                System.out.println(registrado.toString());
                losUsuarios.add(registrado);
            System.out.println(resultado.toString());
            }
            
            return losUsuarios;
        }
        catch (SQLException e) {
            System.err.println("Error al consultar la BD" +
                e.getMessage());
            return new ArrayList();        
        }
    }
}
    
    
    

