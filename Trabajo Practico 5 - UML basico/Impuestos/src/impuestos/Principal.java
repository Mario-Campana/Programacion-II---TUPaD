/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package impuestos;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        // Crear contribuyente
        Contribuyente contribuyente = new Contribuyente("María Gómez", "20-33445566-7");

        // Crear impuesto
        Impuesto impuesto = new Impuesto(10000.0, contribuyente);

        // Crear calculadora y usar dependencia
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }
}

