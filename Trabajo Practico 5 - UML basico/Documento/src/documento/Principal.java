/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package documento;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        // Crear Usuario
        Usuario usuario = new Usuario("Ana López", "ana@example.com");

        // Crear Documento (la firma digital se genera como parte del documento)
        Documento documento = new Documento("Contrato", "Contenido del contrato...", usuario);

        // Mostrar datos
        System.out.println(documento);
        System.out.println("El documento fue firmado digitalmente por: " 
                           + documento.getFirmaDigital().getUsuario().getNombre());
    }
}