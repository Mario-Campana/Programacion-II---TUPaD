/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author Mario Campana
 */
public class Calculadora {
    
    public void calcular(Impuesto impuesto) {       //Dependencia de uso(impuesto parámetro del método calcular de Calculadora)
        System.out.println("El contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("debe abonar el monto $" + impuesto.getMonto());
    }
    
}
