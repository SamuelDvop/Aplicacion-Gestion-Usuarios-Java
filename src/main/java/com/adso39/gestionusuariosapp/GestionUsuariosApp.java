/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.adso39.gestionusuariosapp;

import com.adso39.vistas.PantallaPrincipal;

/**
 *
 * @author Dario
 */
public class GestionUsuariosApp {
    
    public static void main(String[] args) {
        try {
            PantallaPrincipal pantallaPrincipal = 
                    new PantallaPrincipal();
            
            pantallaPrincipal.setLocationRelativeTo(null);
            pantallaPrincipal.setVisible(true);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
