/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AgendaTest {
    
    @Test
    public void testguardarContacto(){
        Agenda agenda = new Agenda();
        Contacto contacto = new Contacto("Ana", "3001234567");
        
        agenda.guardarContacto(contacto);
        assertEquals(1, agenda.getContactos().size());
     
    }
    
    @Test
    public void testBuscarTelefono() {
        Agenda agenda = new Agenda();
        agenda.guardarContacto(new Contacto("Ana", "3001234567"));

        assertEquals("3001234567", agenda.buscarTelefono("Ana"));
    }
    
    
}

 