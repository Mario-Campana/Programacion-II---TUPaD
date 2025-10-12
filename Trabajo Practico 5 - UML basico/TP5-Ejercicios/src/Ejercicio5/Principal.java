/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        Propietario propietario = new Propietario("Mario Luis Campana", "33913153");
        Computadora pc = new Computadora("Asus", "D4N0X2043700000", "Asus Prime A320M-K", "AAR500");
        
        pc.setPropietario(propietario);  //Asociación bidireccional(Solo se necesita 1)
        propietario.setComputadora(pc);  //Asociación bidireccional(Solo se necesita 1)
        
        
        System.out.println("La computadora: " + pc.getMarca());
        System.out.println("es propiedad de : " + pc.getPropietario().getNombre());
        System.out.println("y tiene una Placa Madre: " + pc.getPlacaMadre().getModelo());
    }
}
