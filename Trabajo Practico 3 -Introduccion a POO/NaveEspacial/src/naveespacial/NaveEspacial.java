/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package naveespacial;

/**
 *
 * @author Mario Campana
 */
public class NaveEspacial {

// Defino los atributos---------------------------------------------------------
    private String nombre;
    private int combustible;
    private final int capacidadMaxima = 100; // límite del tanque
    private boolean enVuelo;

// Defino el constructor--------------------------------------------------------
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        if (combustible > capacidadMaxima) {
            this.combustible = capacidadMaxima;
        } else {
            this.combustible = combustible;
        }
        this.enVuelo = false;
    }
    
// Métodos ---------------------------------------------------------------------
    
// Método: despegar
    public void despegar() {
        if (combustible >= 10) {
            enVuelo = true;
            combustible -= 10; // gastar combustible al despegar
            System.out.println(nombre + " ha despegado");
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para despegar.");
        }
    }

// Método: avanzar
    public void avanzar(int distancia) {
        if (!enVuelo) {
            System.out.println(nombre + " no puede avanzar porque no ha despegado.");
        }

        int consumo = distancia * 2; // ejemplo: 2 unidades por cada unidad de distancia

        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanza " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

// Método: recargar
    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad inválida para recargar.");
            return;
        }
        if (combustible + cantidad > capacidadMaxima) {
            combustible = capacidadMaxima;
            System.out.println("El tanque se recargó al máximo (" + capacidadMaxima + ").");
        } else {
            combustible += cantidad;
            System.out.println("Se recarga " + cantidad + " unidades de combustible. Nivel actual: " + combustible);
        }
    }

// Método: mostrar estado
    public void mostrarEstado() {
        System.out.println(" Nave: " + nombre + 
                           " Combustible: " + combustible + "/" + capacidadMaxima + 
                           " En vuelo: " + enVuelo);
    }
}
    

