/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import Modelo.Agenda;
import Controlador.ControladorAgenda;
import Vista.VistaAgenda;
/**
 *
 * @author Daniel
 */
public class Main {
    
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        VistaAgenda vista = new VistaAgenda();
        ControladorAgenda controlador = new ControladorAgenda(agenda, vista);
 
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
}
