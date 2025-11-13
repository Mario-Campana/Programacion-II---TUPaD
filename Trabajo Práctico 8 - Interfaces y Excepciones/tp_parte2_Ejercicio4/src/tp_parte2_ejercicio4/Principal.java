/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_parte2_ejercicio4;

/**
 *
 * @author Mario Campana
 */
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una edad para validar: ");
        int edad = scanner.nextInt();

        try {
            ValidadorEdad.validarEdad(edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Se capturó la excepción: " + e.getMessage());
        }

        scanner.close();
    }
}

