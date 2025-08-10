
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mario Campana
 */
public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        double num3, num4;
    
        System.out.println("Ingrese el número 1: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el número 2: ");
        num2 = input.nextInt();
        
        System.out.println("Ingrese el número 3: ");
        num3 = input.nextDouble();
        System.out.println("Ingrese el número 4: ");
        num4 = input.nextDouble();
        
        System.out.println(num1 + " / " + num2 + " es " + num1/num2);
        System.out.println(num3 + " / " + num4 + " es " + num3/num4);
    }
}
