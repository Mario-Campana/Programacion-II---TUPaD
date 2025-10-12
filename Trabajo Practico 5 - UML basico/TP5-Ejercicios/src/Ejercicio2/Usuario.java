/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Mario Campana
 */
public class Usuario {
    
    //Atributos
    private String nombre;
    private String dni;
    private Celular celular;    //Atributo objeto de tipo Celular (Relación de Asociación bidireccional)

    //Constructor
    public Usuario(String nombre, String dni) {
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

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {       //Relación de asociación bidireccional
        this.celular = celular;
        //Evita bucle infinito
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }
    
}
