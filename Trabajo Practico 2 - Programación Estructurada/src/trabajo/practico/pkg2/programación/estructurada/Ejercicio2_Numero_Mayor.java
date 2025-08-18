/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg2.programación.estructurada;

import java.util.Scanner;

/**
 * 2. Determinar el Mayor de Tres Números: Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.
 * 
 *
 * @author Mario Campana
 */
public class Ejercicio2_Numero_Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, mayor;
       
        System.out.println("Ingrese el primer número: ");
        a = Integer.parseInt(input.nextLine());
        mayor = a;
        
        System.out.println("Ingrese el segundo número: ");
        b = Integer.parseInt(input.nextLine());
        
        if (b > mayor) {
            mayor = b;   
        }
        
        System.out.println("Ingrese el primer número: ");
        c = Integer.parseInt(input.nextLine());
        
        if (c > mayor) {
            mayor = c;
        }
        System.out.println("El mayor número ingresado es " + mayor);
    }
}
