/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Mario Campana
 */
public class Cliente {
    //Atributos
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;   //Atributo de la clase Tarjeta de Crédito (Asociación bidireccional)

    //Constructor
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    //Set para la relación bidireccional con TarjetaDeCredito
    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
        //Evita el bucle infinito
        if (tarjeta != null && tarjeta.getCliente() != this) {
            tarjeta.setCliente(this);
        }
    }
    
}
