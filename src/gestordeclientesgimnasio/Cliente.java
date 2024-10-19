/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestordeclientesgimnasio;

import java.util.*;

/**
 *
 * @author HP
 */
public class Cliente {

    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String planElegido;
    private Date inicioPlan;
    private Date finPlan;

    public Cliente() {
    }

    public Cliente(String cedula, String nombre, String apellido, String correo, String telefono, String planElegido, Date inicioPlan, Date finPlan) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.planElegido = planElegido;
        this.inicioPlan = inicioPlan;
        this.finPlan = finPlan;
    }

    //Getters
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getPlanElegido() {
        return planElegido;
    }

    public Date getInicioPlan() {
        return inicioPlan;
    }

    public Date getFinPlan() {
        return finPlan;
    }

    // Setters
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setPlanElegido(String planElegido) {
        this.planElegido = planElegido;
    }

    public void setInicioPlan(Date inicioPlan) {
        this.inicioPlan = inicioPlan;
    }

    public void setFinPlan(Date finPlan) {
        this.finPlan = finPlan;
    }
}
