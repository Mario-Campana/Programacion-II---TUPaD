/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        
        Contribuyente contribuyente = new Contribuyente("Mario Luis Campana", "20-33913153-0");
        Impuesto impuesto = new Impuesto(30500.0, contribuyente);
        Calculadora calc = new Calculadora();
        calc.calcular(impuesto); // Dependencia de Uso
    }
    
}
