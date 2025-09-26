/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qr;

/**
 *
 * @author Mario Campana
 */
public class GeneradorQR {
    // Dependencia de creación: crea el objeto dentro del método
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario); // creado aquí, no guardado
        System.out.println("Se generó el código QR: " + qr);
    }
}

