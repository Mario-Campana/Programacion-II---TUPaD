/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qr;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        // Crear usuario
        Usuario usuario = new Usuario("Carlos Pérez", "carlos.perez@email.com");

        // Crear generador y generar un código QR
        GeneradorQR generador = new GeneradorQR();
        generador.generar("QR123456", usuario);
    }
}

