/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_parte2_ejercicio5;

/**
 *
 * @author Mario Campana
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaTry {
    public static void main(String[] args) {

        String ruta = "archivo.txt"; // Cambiar por un archivo existente

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}


