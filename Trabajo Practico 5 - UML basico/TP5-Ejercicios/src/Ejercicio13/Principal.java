/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Mario Luis Campana", "mario_campana@gmail.com");
        GeneradorQR genQR = new GeneradorQR();
        genQR.generar("123456789", usuario); // Dependencia de Creación
    }
    
}
