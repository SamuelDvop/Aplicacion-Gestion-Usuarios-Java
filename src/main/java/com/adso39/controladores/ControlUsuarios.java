/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adso39.controladores;

import com.adso39.modelos.Usuario;
import com.adso39.persistencia.Usuarios;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dario
 */
public class ControlUsuarios {
    private static Usuario elUsuario = new Usuario();
    private static Usuarios losUsuarios = new Usuarios();
    private static List<Usuario> listaUsuarios = new ArrayList<>();

    public static String ListarUsuarios() {
        String texto = "";
        for (int i = 0; 1<listaUsuarios.size(); i++){
            texto += listaUsuarios.get(i).toString() + "\n";       
        }
        return texto;
    }
    
    public static void RegistrarUsuario(String identificacion, 
            String nombres, 
            String apellidos, 
            int indiceCargo, 
            String textoCargo, 
            boolean esAdministrador) {
        elUsuario.setIdentificacion(identificacion);
        elUsuario.setNombres(nombres);
        elUsuario.setApellidos(apellidos);
        elUsuario.setIndiceCargo(indiceCargo);
        elUsuario.setTextoCargo(textoCargo);
        elUsuario.setEsAdministrador(esAdministrador);
    }
    
    public static String ImprimirUsuario() {
        return elUsuario.toString();
    }
    
    public static void AgregarUsuario(
        String Identificacion,
        String nombre,
        String apellidos,
        int indiceCargo,
        String textoCampo,
            boolean esAdministrador) {
                Usuario elNuevo = new Usuario (
                    Identificacion,
                    nombre,
                    apellidos,
                    indiceCargo,
                    textoCampo,
                    esAdministrador
                );
                
                try {
                    Usuarios losUsuarios = new Usuarios ();
                    
                    if (losUsuarios.registrarUsuario(elNuevo)) {
                        System.out.println("El usuario fue insertado en BD");
                        listaUsuarios.add(elNuevo);
                    } else {
                        System.out.println("El usuario no fue insertado en BD");
                    }
                    
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                
                }
                
                listaUsuarios.add(elNuevo);
            } 
    
    public static ArrayList<Usuario> MostrarUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList();
        try {
            Usuarios losUsuarios = new Usuarios ();
            usuarios = losUsuarios.consultarUsuarios();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return usuarios;
    }
}
 
