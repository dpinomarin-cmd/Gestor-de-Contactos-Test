/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Agenda;
import Modelo.Contacto;
import Vista.VistaAgenda;

/**
 *
 * @author Daniel
 */
public class ControladorAgenda {
    
    private Agenda agenda;
    private VistaAgenda vista;
 
    public ControladorAgenda(Agenda agenda, VistaAgenda vista) {
        this.agenda = agenda;
        this.vista = vista;
        this.vista.setControlador(this);
    }
 
    public void guardarContacto(String nombre, String telefono) {
        Contacto nuevo = new Contacto(nombre, telefono);
        agenda.guardarContacto(nuevo);
    }
 
    public String buscarTelefono(String nombre) {
        return agenda.buscarTelefono(nombre);
    }
    
}
