
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mario Campana
 */
public class OperacionesAritmeticas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, suma, resta, multiplicacion, division;
        
        
        
        System.out.println("Ingrese el primer número: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingerse el segundo número: ");
        num2 = Integer.parseInt(input.nextLine());
    
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 /num2;
        
        System.out.println("La suma de " + num1 + " + " + num2 + " es " + suma);
        System.out.println("La resta de " + num1 + " - " + num2 + " es " + resta);
        System.out.println("La multiplicación de " + num1 + " x " + num2 + " es " + multiplicacion);
        System.out.println("La division de " + num1  + " / " + num2 + " es "  + division);
    }
    
}
