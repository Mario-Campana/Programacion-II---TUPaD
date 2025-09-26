/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impuestos;

/**
 *
 * @author Mario Campana
 */
public class Calculadora {
    // Dependencia de uso: recibe Impuesto como parámetro pero no lo guarda
    public void calcular(Impuesto impuesto) {
        double monto = impuesto.getMonto();
        double recargo = monto * 0.21; // Ejemplo: IVA 21%
        double total = monto + recargo;

        System.out.println("Calculando impuesto para " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto base: $" + monto);
        System.out.println("Recargo (21%): $" + recargo);
        System.out.println("Total a pagar: $" + total);
    }
}

