/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author Mario Campana
 */
public class CitaMedica {
    //Atributos
    private String fecha;
    private String hora;
    private Paciente paciente;          //Atributo de clase Paciente (Asociación unidireccional)
    private Profesional profesional;    //Atributo de clase Paciente (Asociación unidireccional)

    //Constructor
    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    //Getters y Setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {    //Set para asociación unidireccional con Paciente
        this.paciente = paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {   //Set para asociación unidireccional con Profesional
        this.profesional = profesional;
    }
    
}
