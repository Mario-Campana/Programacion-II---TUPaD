/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author Mario Campana
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Figura> lista = new ArrayList<>();
        
        Rectangulo rec1 = new Rectangulo("rec1",5,4);
        Rectangulo rec2 = new Rectangulo("rec2",6,7);
        Circulo cir1 = new Circulo("cir",5);
        Circulo cir2 = new Circulo("cir2",6);
        
        lista.add(rec1);
        lista.add(rec2);
        lista.add(cir1);
        lista.add(cir2);
        
        for (Figura figura : lista) {
            System.out.println("Área del " + figura.getNombre() + ": " + figura.calcularArea());
            
        }
        
    }
    
}
