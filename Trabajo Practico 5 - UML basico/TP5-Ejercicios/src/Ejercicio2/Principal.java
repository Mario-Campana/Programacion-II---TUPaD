/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Mario Campana
 */

public class Principal {
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("Mario Luis Campana", "33913153");
        Bateria bateria = new Bateria("HTC U11", 5000);
        Celular celular = new Celular("Motorola", "G82", "49-015420-323751-8", bateria);
        
        usuario.setCelular(celular);  //Relación de asociación bidireccional
        celular.setUsuario(usuario);  //Con uno alcanza
        
        System.out.println("El Usuario: " + celular.getUsuario().getNombre());
        System.out.println("Tiene el celular: " + usuario.getCelular().getMarca() + " " + usuario.getCelular().getModelo());
        System.out.println("Batería: " + celular.getBateria().getModelo());
    }
}    

