/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.personaNataly;


import controlador.tda.grafo.GrafoEND;
import modelo.Persona;
import modelo.TipoPersona;

/**
 *
 * @author sebastian
 */
public class PersonaGrafoController {
   
    private GrafoEND <Persona> gend;
    private Persona persona;

    public PersonaGrafoController(Integer nro_vertices) {
        gend = new GrafoEND <>(nro_vertices, Persona.class);
        for(int i = 1; i <= nro_vertices; i++) {
            Persona p = new Persona();
            p.setId(i);
            p.setNombres("Persona "+i);
            p.setTipoPersona(TipoPersona.CLIENTE);
            gend.etiquetarVertice(i, p);
        }
    }

    public GrafoEND <Persona> getGend() {
        return gend;
    }

    public void setGend(GrafoEND <Persona> gend) {
        this.gend = gend;
    }

    public Persona getPersona() {
        if(persona == null)
            persona = new Persona();        
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    
}
