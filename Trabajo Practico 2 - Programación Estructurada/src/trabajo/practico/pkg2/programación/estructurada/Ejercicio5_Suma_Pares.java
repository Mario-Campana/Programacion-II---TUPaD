/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg2.programación.estructurada;

import java.util.Scanner;

/**
 *5. Suma de Números Pares (while).
 * Escribe un programa que solicite números al usuario y sume solo los números pares. El ciclo debe continuar hasta que el usuario ingrese 
 * el número 0, momento en el que se debe mostrar la suma total de los pares ingresados.
 * 
 * @author Mario Campana
 */
public class Ejercicio5_Suma_Pares {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int sumaPares = 0;

        System.out.print("Ingrese un número (0 para terminar): ");
        numero = input.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {          // Se verifica si es par
                sumaPares += numero;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = input.nextInt();
        }

        System.out.println("La suma de los números pares ingresados es: " + sumaPares);

    }
}
