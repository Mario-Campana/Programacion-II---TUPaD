/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg2.programación.estructurada;

import java.util.Scanner;

/**
 * Calculadora de Descuento según categoría.
 * Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
 * Luego, aplique los siguientes descuentos:
 * Categoría A: 10% de descuento
 * Categoría B: 15% de descuento
 * Categoría C: 20% de descuento
 * El programa debe mostrar el precio original, el descuento aplicado y el precio final 
 * 
 * @author Mario Campana
 */
public class Ejercicio4_Precio_Descuento {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();
        
        while (precio < 0) {            
            System.out.print("Ingrese el precio del producto: ");
            precio = input.nextDouble();
        }

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = input.next().charAt(0);
        
        while (categoria != 'A' && categoria != 'B' && categoria != 'C') {
            System.out.print("Ingrese la categoría del producto (A, B o C): ");
            categoria = input.next().charAt(0);
        } 

        double descuento = 0;
        String porcentaje = "0";
         
        switch (categoria) {
            case 'A':
                descuento = 0.10;
                porcentaje = "10%";
                break;
            case 'B':
                descuento = 0.15;
                porcentaje = "15%";
                break;
            case 'C':
                descuento = 0.20;
                porcentaje = "20%";
                break;
        }

        double precioFinal = precio * (1 - descuento);
        double descuentoAplicado = precio * descuento;

        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + porcentaje);
        System.out.println("Precio final: " + precioFinal);

    }
}
    
