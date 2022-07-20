/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.jarras;

import controlador.tda.arboles.NodoArbol;
import controlador.tda.lista.ListaEnlazada;

/**
 *
 * @author javisarango
 */
public class ArbolJarras {
    private NodoJarras estado_inicial;
    private NodoJarras estado_final;
    private ListaEnlazada<NodoJarras> nodos;
    private ListaEnlazada<NodoJarras> listaNodos;

    public ArbolJarras(NodoJarras ei, NodoJarras ef) {
        this.estado_inicial = ei;
        this.estado_final = ef;
        nodos = new ListaEnlazada<>();
        listaNodos = new ListaEnlazada<>();
    }

    public ArbolJarras() {
    }
    
    public NodoJarras busqueda_anchura() throws Exception{
        if (estado_inicial!= null && estado_final != null) {
            if (NodoJarras.comparar(estado_inicial, estado_final)) {
                nodos = new ListaEnlazada<>();
                nodos.insertarCabecera(estado_final);
                return estado_final;
                
            }else{
            nodos = new ListaEnlazada<>();
            listaNodos = new ListaEnlazada<>();
            listaNodos.insertar(estado_inicial, Reglas.posicion(listaNodos));
                while (listaNodos.getSize() > 0) {                    
                    //Programar la busqueda en anchura
                    
                }
            }
        }
    
    
    return null;
    }
    
    
}
