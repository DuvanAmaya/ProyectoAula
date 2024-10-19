/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestordeclientesgimnasio;
import java.time.LocalDateTime;

/**
 *
 * @author DANIEL
 */
public class Entrenadores {
    private String nombre;
    private String apellido;
    private LocalDateTime horaLlegada;
    private LocalDateTime horaSalida;

    // Constructor
    public Entrenadores(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Métodos para registrar la llegada y salida
    public void registrarLlegada() {
        this.horaLlegada = LocalDateTime.now(); // Registra la hora actual
        System.out.println("Hora de llegada registrada: " + horaLlegada);
    }

    public void registrarSalida() {
        this.horaSalida = LocalDateTime.now(); // Registra la hora actual
        System.out.println("Hora de salida registrada: " + horaSalida);
    }

    // Getters para obtener las horas registradas
    public LocalDateTime getHoraLlegada() {
        return horaLlegada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    // Método para mostrar el nombre completo del entrenador
    public String getNombreCompleto() {
        return nombre + " " + apellido;
}
}
