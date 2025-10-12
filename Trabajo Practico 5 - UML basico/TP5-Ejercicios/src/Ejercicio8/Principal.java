/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Mario Luis Campana", "mario_campana@gmail.com");
        Documento doc = new Documento("Apertura Cuenta Bancaria", "Contenido******", "45gggg", "2025-10-07", usuario);

        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Firma tiene un usuario: " + doc.getFirma().getUsuario().getNombre());
        System.out.println("Hash: " + doc.getFirma().getCodigoHash());
    }
}
