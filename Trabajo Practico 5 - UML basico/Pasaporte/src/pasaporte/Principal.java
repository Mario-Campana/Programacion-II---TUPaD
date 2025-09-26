/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pasaporte;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        // Crear Foto
        Foto foto = new Foto("imagen123.jpg", "JPG");

        // Crear Titular
        Titular titular = new Titular("Juan Pérez", "12345678");

        // Crear Pasaporte
        Pasaporte pasaporte = new Pasaporte("A12345", "2025-09-25", foto, titular);

        // Mostrar datos
        System.out.println(pasaporte);
        System.out.println("El titular " + titular.getNombre() +
                           " tiene el pasaporte: " + titular.getPasaporte().getNumero());
    }
}
