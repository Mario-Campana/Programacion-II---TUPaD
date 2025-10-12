/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Mario Luis Campana", "33913153");
        Mesa mesa = new Mesa(2, 6);
        Reserva reserva = new Reserva("2025-08-08", "20:30 hs", mesa);  //Agregación: Reserva tiene una mesa.
        
        //Asociación unidireccional
        reserva.setCliente(cliente);
        
        System.out.println("Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Reserva para: " + reserva.getFecha() + " " + reserva.getHora());
        System.out.println("Mesa número: " + reserva.getMesa().getNumero());
    }
    
}
