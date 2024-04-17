/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestordeclientesgimnasio;

import Vistas.VentanaPrincipal;
import javax.swing.JFrame;

 class GestorDeClientesGimnasio {

    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setLocationRelativeTo(ventana);
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        ventana.setTitle("Gestor de Clientes");
        ventana.setVisible(true);
    }
    
}
