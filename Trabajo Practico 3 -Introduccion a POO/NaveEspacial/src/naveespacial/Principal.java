/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package naveespacial;

/**
 *
 * @author Mario Campana
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial("Nautilus", 50);

        // Intentar avanzar sin recargar
        nave.despegar();
        nave.avanzar(30); // debería fallar por falta de combustible

        // Recargar y avanzar correctamente
        nave.recargarCombustible(40);
        nave.avanzar(10);

        // Mostrar estado final
        nave.mostrarEstado();
    }
    
}
