/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Mario Luis Campana", "OMINT");
        Profesional profesional = new Profesional("Dra. Ana Calvo", "Dermatología");
        CitaMedica cita = new CitaMedica("2025-08-20", "09:00");
        
        cita.setProfesional(profesional);   //Uso del set para asociación unidireccional
        cita.setPaciente(paciente);         //Uso del set para asociación unidireccional
        
        System.out.println("El paciente: " + cita.getPaciente().getNombre());
        System.out.println("tiene cita con Profesional: " + cita.getProfesional().getNombre());
        
    }
}
