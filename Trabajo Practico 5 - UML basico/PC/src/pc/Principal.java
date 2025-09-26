/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pc;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        // Crear PlacaMadre
        PlacaMadre placa = new PlacaMadre("ASUS ROG STRIX", "Z790");

        // Crear Propietario
        Propietario propietario = new Propietario("Lucas Fernández", "12345678");

        // Crear Computadora (composición + asociación bidireccional)
        Computadora computadora = new Computadora("ASUS", "SN123456789", placa, propietario);

        // Mostrar datos
        System.out.println(computadora);
        System.out.println("El propietario " + propietario.getNombre() +
                           " posee la computadora con número de serie: " +
                           propietario.getComputadora().getNumeroSerie());
    }
}
