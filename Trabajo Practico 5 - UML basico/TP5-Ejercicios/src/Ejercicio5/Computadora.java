/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Mario Campana
 */
public class Computadora {
    //Atributos
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;      //Atributo de tipo PlacaMadre (Composición)
    private Propietario propietario;    //Atributo de tipo Propietario (Asociación bidireccional)

    //Constructor
    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {   //modelo y chipset son los atributos de PlacaMadre
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);  //El objeto de tipo PlacaMadre se crea dentro de la clase Computadora
    }

    //Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public void setPlacaMadre(PlacaMadre placaMadre) {
        this.placaMadre = placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {   //Set Propietario para Asociación bidireccional
        this.propietario = propietario;
        //Evita el bucle infinito
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }
    
}
