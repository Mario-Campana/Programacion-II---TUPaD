/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg2.programación.estructurada;

/**
 * 13. Impresión recursiva de arrays antes y después de modificar un elemento. 
 * Crea un programa que: 
 * a. Declare e inicialice un array con los precios de algunos productos. 
 * b. Use una función recursiva para mostrar los precios originales. 
 * c. Modifique el precio de un producto específico. 
 * d. Use otra función recursiva para mostrar los valores modificados.

 *
 * @author Mario Campana
 */
public class Ejercicio13_ImpresionRecursivaArrays {
    
    public static void main(String[] args) {

        // a. Declarar e inicializar array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostrar precios originales usando función recursiva
        System.out.println("Precios originales:");
        imprimirPrecios(precios, 0);

        // c. Modificar el precio de un producto específico (ej: producto 3)
        precios[2] = 129.99;

        // d. Mostrar precios modificados usando otra función recursiva
        System.out.println("\nPrecios modificados:");
        imprimirPrecios(precios, 0);
    }

    // Función recursiva para imprimir el array
    public static void imprimirPrecios(double[] precios, int indice) {
        if (indice >= precios.length) {
            return; // Caso base: llegamos al final del array
        }
        System.out.println("Producto " + (indice + 1) + ": $" + precios[indice]);
        imprimirPrecios(precios, indice + 1); // Llamada recursiva al siguiente elemento
    }
}
 
    
  
