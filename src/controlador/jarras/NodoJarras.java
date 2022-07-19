/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.jarras;

import controlador.tda.lista.ListaEnlazada;

/**
 *
 * @author javisarango
 */
public class NodoJarras {
    private Jarra jarraG;
    private Jarra jarraP;
    private NodoJarras padre; //posicion inicial 0.0
    private ListaEnlazada<NodoJarras> sucesores;

    public NodoJarras() {
        jarraG = new Jarra();
        jarraP = new Jarra();
        jarraG.setCapacidad(4);
        jarraP.setCapacidad(3);
        jarraG.setCapacidad_actual(0);
        jarraP.setCapacidad_actual(0);
    }

    public NodoJarras(Integer jg, Integer jp) {
       this();
       jarraG.setCapacidad_actual(jg);
       jarraP.setCapacidad_actual(jp);
    }

    public Jarra getJarraG() {
        return jarraG;
    }

    public void setJarraG(Jarra jarraG) {
        this.jarraG = jarraG;
    }

    public Jarra getJarraP() {
        return jarraP;
    }

    public void setJarraP(Jarra jarraP) {
        this.jarraP = jarraP;
    }

    public NodoJarras getPadre() {
        return padre;
    }

    public void setPadre(NodoJarras padre) {
        this.padre = padre;
    }

    public ListaEnlazada<NodoJarras> getSucesores() {
        return sucesores;
    }

    public void setSucesores(ListaEnlazada<NodoJarras> sucesores) {
        this.sucesores = sucesores;
    }
    
    
    
    public static Boolean comparar(NodoJarras i, NodoJarras f){
        if (i != null && f != null) {
            if (i.getJarraG().getCapacidad_actual().intValue() == f.getJarraG().getCapacidad_actual().intValue()&&
                 i.getJarraP().getCapacidad_actual().intValue() == f.getJarraP().getCapacidad_actual().intValue()   ) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "["+jarraG.toString() + " , "+ jarraP.toString()+"]";
    }
    
    
    
}
