/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg2.programación.estructurada;

import java.util.Scanner;

/**
 * 8. Cálculo del Precio Final con impuesto y descuento. 
 * Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto en un e-commerce. La fórmula es: 
 * PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
 * Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento, llama al método y muestra el precio final.
 * Ejemplo de entrada/salida:
 * Ingrese el precio base del producto: 100
 * Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10
 * Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5
 * El precio final del producto es: 105.0
 * 
 * 
 * @author Mario Campana
 */
public class Ejercicio8_Calculo_Precio_Final {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedimos datos al usuario
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = input.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = input.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = input.nextDouble();

        // Llamamos al método
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Mostramos el resultado
        System.out.println("El precio final del producto es: " + precioFinal);
    }
    
     // Método que calcula el precio final
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // Convertimos los porcentajes a decimales dividiendo por 100
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100;

        // Aplicamos la fórmula
        return precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
    }
}
    

