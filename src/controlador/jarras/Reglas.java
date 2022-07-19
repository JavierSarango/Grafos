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
public class Reglas {

    public static ListaEnlazada<NodoJarras> reglas(Jarra jg, Jarra jp) {
        Integer x = jg.getCapacidad_actual();
        Integer y = jp.getCapacidad_actual();
        ListaEnlazada<NodoJarras> reglas = new ListaEnlazada<>();
        int pos = -1;
        try {

            //Llenar toda la jarra grande
            if (x < jg.getCapacidad()) {
                reglas.insertar(new NodoJarras(jg.getCapacidad(), y), posicion(reglas));
            }
            //Llenar toda la jarra pequeña
            if (y < jp.getCapacidad()) {
                reglas.insertar(new NodoJarras(x, jp.getCapacidad()), posicion(reglas));
            }
            //Vaciar la jarra grande
            if (x > 0) {
                reglas.insertar(new NodoJarras(0, y), posicion(reglas));
            }
            //Vaciar la jarra pequeña
            if (y > 0) {
                reglas.insertar(new NodoJarras(x, 0), posicion(reglas));
            }
            //Vaciar el contenido de la jarra grande a la jarra pequeña hasta llenarla
            if (((x + y) >= jp.getCapacidad()) && (y < jp.getCapacidad() && x > 0)) {
                reglas.insertar(new NodoJarras(x - (jp.getCapacidad() - y), jp.getCapacidad()), posicion(reglas));
            }
            //Vaciar el contenido de la jarra pequeña a la jarra grande hasta llenarla
            if (((x + y) >= jg.getCapacidad()) && (x < jg.getCapacidad() && y > 0)) {
                reglas.insertar(new NodoJarras(jg.getCapacidad(), y - (jg.getCapacidad() - x)), posicion(reglas));
            }
            //JG = 4  Jp = 1
            //JG =    JP = 
            
            
            //Vaciar todo el contenido de la jarra grande a la jarra pequeña
            if (((x + y) <= jp.getCapacidad()) && (x > 0)) {
                reglas.insertar(new NodoJarras(0, (y + x)), posicion(reglas));
            }

            //Vaciar todo el contenido de la jarra pequeña a la jarra grande
            if (((x + y) <= jg.getCapacidad()) && (y > 0)) {
                reglas.insertar(new NodoJarras((x+y), 0), posicion(reglas));
            }
        } catch (Exception e) {
        }
        return reglas;

    }

    public static Integer posicion(ListaEnlazada<NodoJarras> lista) {
        return (lista.getSize() > 0) ? lista.getSize() - 1 : 0;
    }
    public static void main(String[] args) {
        NodoJarras nodos = new NodoJarras(4,1);
        ListaEnlazada<NodoJarras> reglas = Reglas.reglas(nodos.getJarraG(), nodos.getJarraP());
        reglas.imprimir();
    }
}
