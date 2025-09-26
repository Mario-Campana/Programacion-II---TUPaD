/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasaporte;

/**
 *
 * @author Mario Campana
 */
// Clase Pasaporte (compone Foto y se asocia bidireccionalmente con Titular)
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;      // composición
    private Titular titular; // asociación bidireccional

    public Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.titular = titular;
        // al crear el pasaporte, vinculamos también al titular
        this.titular.setPasaporte(this);
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Pasaporte [numero=" + numero + ", fechaEmision=" + fechaEmision +
                ", foto=" + foto + ", titular=" + titular + "]";
    }
}
