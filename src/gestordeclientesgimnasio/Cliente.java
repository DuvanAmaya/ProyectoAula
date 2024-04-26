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
    public String cedula;
    public String nombre;
    public String apellido;
    public String correo;
    public String telefono;
    public String planElegido;
    public Date inicioPlan;
    public Date finPlan;
    
    public Cliente(String cedula, String nombre, String apellido, String correo, String telefono, String  planElegido, Date inicioPlan, Date finPlan){
       this.cedula = cedula;
       this.nombre = nombre;
       this.apellido = apellido;
       this.correo = correo;
       this.telefono = telefono;
       this.planElegido = planElegido;
       this.inicioPlan = inicioPlan;
       this.finPlan = finPlan;
    }

    
}
