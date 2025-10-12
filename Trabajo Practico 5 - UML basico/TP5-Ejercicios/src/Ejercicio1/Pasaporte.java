/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Mario Campana
 */
public class Pasaporte {
    
    //Atributos
    private String numero;
    private String fechaEmision;
    private Foto foto;              //Atributo de tipo objeto Foto (Composición)
    private Titular titular;        //Atributo de tipo objeto Titular(Asociación Bidireccional)

    //Constructor (con imagen y formato para crear el objeto de tipo Foto)
    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato); //Creación del objeto tipo Foto(Composición)
    }
    
    //Getters y Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {          //Asociación bidireccional
        this.titular = titular;
        //Evitar bucle infinito
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }
    
}
