/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg2.programación.estructurada;

import java.util.Scanner;

/**
 * 
 * 10. Actualización de stock a partir de venta y recepción de productos.
 * Crea un método actualizarStock(int stockActual, int cantidadVendida,
 * int cantidadRecibida), que calcule el nuevo stock después de una venta y recepción
 * de productos:
 * NuevoStock = StockActual − CantidadVendida + CantidadRecibida
 * NuevoStock = CantidadVendida + CantidadRecibida
 * Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado.
 *
 * @author Mario Campana
 */
public class Ejercicio10_Actualizar_Stock {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = input.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = input.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = input.nextInt();

        // Cálculo
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        // Salida
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

    // Método para calcular el nuevo stock
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}
    

