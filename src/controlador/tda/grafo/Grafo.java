/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.tda.grafo;

import controlador.tda.grafo.exception.VerticeException;
import controlador.tda.lista.ListaEnlazada;
import java.util.HashMap;

/**
 *
 * @author javisarango
 */
public abstract class Grafo {

    public abstract Integer numVertices();

    public abstract Integer numAristas();

    public abstract Object[] existeArista(Integer i, Integer f) throws VerticeException;

    public abstract Double pesoArista(Integer i, Integer f) throws VerticeException;

    public abstract void insertarArista(Integer i, Integer f) throws VerticeException;

    public abstract void insertarArista(Integer i, Integer f, Double peso) throws VerticeException;

    public abstract ListaEnlazada<Adyacencia> adyacentes(Integer i) throws VerticeException;

    @Override
    public String toString() {
        StringBuilder grafo = new StringBuilder();
        for (int i = 1; i < numVertices(); i++) {
            grafo.append("VERTICE " + i);
            try {
                ListaEnlazada<Adyacencia> lista = adyacentes(i);
                for (int j = 0; j < lista.getSize(); j++) {
                    Adyacencia aux = lista.obtenerDato(j);
                    if (aux.getPeso().toString().equalsIgnoreCase(String.valueOf(Double.NaN))) {
                        grafo.append("---VERTICE DESTINO----- " + aux.getDestino());
                    } else {
                        grafo.append("---VERTICE DESTINO----- " + aux.getDestino() + "--peso-- " + aux.getPeso());

                    }
                }
                grafo.append("\n");
            } catch (Exception e) {
                System.out.println("Error en to String " + e);
            }
        }
        return grafo.toString();
    }

}
