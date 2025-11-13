/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_parte2_ejercicio2;

/**
 *
 * @author Mario Campana
 */
import java.util.Scanner;

public class ConversionCadenaNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un texto para convertir a entero: ");
        String texto = scanner.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: \"" + texto + "\" no es un número válido.");
        }

        scanner.close();
    }
}

