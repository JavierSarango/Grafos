/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.personaNataly;


import controlador.tda.grafo.GrafoEND;
import modelo.Persona;
import modelo.TipoPersona;
import modelo.Ubicacion;

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
            Ubicacion u = new Ubicacion();
            u.setId(i);
            u.setLatitud(0.0);
            u.setLongitud(0.0);
            p.setUbicacion(u);
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
    public Double calcularDistancia(Persona po, Persona pd){
    Double dis = 0.0;
    //DIstancia = raiz cuadrada de x1 - x2 al cuadrado, más y1 - y2 al cuagrado.
    Double y = po.getUbicacion().getLongitud() - pd.getUbicacion().getLongitud();
    Double x = po.getUbicacion().getLatitud() - pd.getUbicacion().getLatitud();
    dis = Math.sqrt((x*x)+(y*y));
    
    return dis;
    }
    
    
}
