/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg2.programación.estructurada;

/**
 * 12. Modificación de un array de precios y visualización de resultados.
 * Crea un programa que:
 * a. Declare e inicialice un array con los precios de algunos productos.
 * b. Muestre los valores originales de los precios.
 * c. Modifique el precio de un producto específico.
 * d. Muestre los valores modificados.
 * 
 * @author Mario Campana
 */
public class Ejercicio12_ArrayPrecios {
    
    public static void main(String[] args) {

        // a. Declarar e inicializar array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostrar valores originales
        System.out.println("Precios originales:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Producto " + (i + 1) + ": $" + precios[i]);
        }

        // c. Modificar el precio de un producto específico (ej: producto 3)
        precios[2] = 129.99; // recordá que los arrays en Java comienzan en índice 0

        // d. Mostrar valores modificados
        System.out.println("\nPrecios modificados:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Producto " + (i + 1) + ": $" + precios[i]);
        }
    }
}
    
