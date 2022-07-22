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
public class ArbolJarras {

    private NodoJarras estado_inicial;
    private NodoJarras estado_final;
    private ListaEnlazada<NodoJarras> nodos; //Nos guarda todos los nodos generados//nodos y lista nodos, nos sirven para poder construir el camino
    private ListaEnlazada<NodoJarras> listaNodos;// es temporal

    public ArbolJarras(NodoJarras ei, NodoJarras ef) {
        this.estado_inicial = ei;
        this.estado_final = ef;
        nodos = new ListaEnlazada<>();
        listaNodos = new ListaEnlazada<>();
    }

    public ArbolJarras() {
    }

    public NodoJarras busqueda_anchura() throws Exception {
        if (estado_inicial != null && estado_final != null) {
            if (NodoJarras.comparar(estado_inicial, estado_final)) {
                nodos = new ListaEnlazada<>();
                nodos.insertarCabecera(estado_final);
                return estado_final;

            } else {
                nodos = new ListaEnlazada<>();
                listaNodos = new ListaEnlazada<>();
                listaNodos.insertar(estado_inicial, Reglas.posicion(listaNodos));
                nodos.insertar(estado_inicial, Reglas.posicion(nodos));
                while (listaNodos.getSize() > 0) {
                    //Programar la busqueda en anchura
                    NodoJarras actual = listaNodos.eliminarDato(0);
                    if (NodoJarras.comparar(actual, estado_final)) {
                        return actual;
                    } else {
                        ListaEnlazada<NodoJarras> reglas = Reglas.reglas(actual.getJarraG(), actual.getJarraP());
                        System.out.println("Antes de borrar");
                        reglas.imprimir();
                        reglas = this.eliminarReglasRepetidas(reglas);
                        System.out.println("Despues de borrar");
                        reglas.imprimir();
                        actual.aplicarReglas(reglas);
                        for (int i = 0; i < reglas.getSize(); i++) {
                            NodoJarras auxR = reglas.obtenerDato(i);
                            nodos.insertar(auxR, Reglas.posicion(nodos));
                            listaNodos.insertar(auxR, Reglas.posicion(listaNodos));
                            if (NodoJarras.comparar(auxR, estado_final)) {
                                return auxR;
                            }
                        }

                    }

                }
            }
        }

        return null;
    }

    //Recorre la lista y comprueba si hay reglas repetidas, en ese caso no deja aplicarla nuevamente
    private ListaEnlazada<NodoJarras> eliminarReglasRepetidas(ListaEnlazada<NodoJarras> reglas) throws Exception {
        ListaEnlazada<NodoJarras> lista_res = new ListaEnlazada<>();
        if (reglas.getSize() > 0) {
            NodoJarras[] reglasA = reglas.toArray();
            for (int i = 0; i < reglasA.length; i++) {
                NodoJarras auxRegla = reglasA[i];
                Boolean band = true;
                for (int j = 0; j < nodos.getSize(); j++) {
                    NodoJarras aux = nodos.obtenerDato(j);
                    if (NodoJarras.comparar(auxRegla, aux)) {
                        band = false;
                        break;
                    }
                }
                if (band) {
                    lista_res.insertarCabecera(auxRegla);
                }
            }
        }
        return lista_res;
    }
    public ListaEnlazada<NodoJarras> camino(NodoJarras nodo)throws Exception{
    ListaEnlazada<NodoJarras> camino = new ListaEnlazada<>();
    NodoJarras n = nodo;
        while (n!= null) {            
            camino.insertarCabecera(n);
            n = n.getPadre();
        }
        return camino;
    }
    public static void main(String[] args) {
        NodoJarras inicial = new NodoJarras(0, 0);
        NodoJarras finall = new NodoJarras(3, 0);
        ArbolJarras aj = new ArbolJarras(inicial, finall);
        try {
            NodoJarras busqueda = aj.busqueda_anchura();
            if (busqueda != null) {
                System.out.println("El camino es");
                aj.camino(busqueda).imprimir();
            }else{
                System.out.println("No hay camino");}
//            System.out.println(busqueda.toString());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en BUsqueda");
        }
    }
}
