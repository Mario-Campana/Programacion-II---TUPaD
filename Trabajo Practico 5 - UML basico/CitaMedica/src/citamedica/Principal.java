/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package citamedica;

/**
 *
 * @author Mario Campana
 */
public class Principal {
    public static void main(String[] args) {
        // Crear Paciente
        Paciente paciente = new Paciente("María González", "OSDE");

        // Crear Profesional
        Profesional profesional = new Profesional("Dr. Pérez", "Cardiología");

        // Crear Cita Médica
        CitaMedica cita = new CitaMedica("2025-10-02", "15:30", paciente, profesional);

        // Mostrar datos
        System.out.println(cita);
        System.out.println("Paciente de la cita: " + cita.getPaciente().getNombre());
        System.out.println("Profesional asignado: " + cita.getProfesional().getNombre());
    }
}
