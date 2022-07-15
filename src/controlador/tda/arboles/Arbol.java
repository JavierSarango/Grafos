package controlador.tda.arboles;

import controlador.tda.lista.ListaEnlazada;

/**
 *
 * @author javisarango
 */
public class Arbol {
    
    private NodoArbol raiz;
    private Integer size;
    private Integer altura;
    private ListaEnlazada<ListaEnlazada<NodoArbol>> niveles;
    private ListaEnlazada<NodoArbol> orden;
    
    public Arbol() {
        raiz = null;
        altura = 0;
        size = 0;
        niveles = new ListaEnlazada<>();
        orden = new ListaEnlazada<>();
    }
    
    public Boolean insertar(Integer valor) {
        if (raiz == null) { //Si no hay raiz 
            raiz = new NodoArbol(valor); //se la crea con el valor del parametro 
            size++; //y se aumenta el tamaño del arbol en 1
            return true; // retorna true, y la raiz se inserta.
        } else { // sino (Si, sí hay una raiz, entonces
            
            NodoArbol nuevo = new NodoArbol(valor); //Se crea un nuevo nodo con el valor enviado por parametro
            NodoArbol actual = raiz; // El nodo actual es el nodo de partida, es decir, la raiz
            NodoArbol padre; // se designa una variable nodoarbol "padre" para designar que nodo sera el padre
            while (true) { //mientras sea verdad
                padre = actual; // AL momento de iniciar, el nodo padre es el nodo actual que a su vez es el valor de la raiz
                if (valor.intValue() == actual.getValor().intValue()) { // Si el valor que se le envia, es igual a la raiz. 
                    return false; //Entonces no lo acepta, retorna false y no se inserta nada.
                } else if (valor.intValue() < actual.getValor().intValue()) {// Si el valor, es menor a la raiz, entonces se inserta el nodo hacia la izquierda. (Siempre se inicia desde la izquierda)
                    actual = actual.getIzquierda(); //Actual toma el valor del nodo hacia la izquierda
                    if (actual == null) { //Si el valor tomado (getIzquierda), es nulo, entonces
                        nuevo.setPadre(padre); //De los nodos a la izquierda, el nuevo nodo sera el padre 
                        padre.setIzquierda(nuevo); // Entonces padre se irá hacia la izquierda
                        size++; //se incrementa el tamaño del arbol en 1
                        return true;          //retorna true, y el nodo se inserta.              
                    }
                    
                }else{ //SIno, se hace todo lo contrario al metodo anterior.
                actual = actual.getDerecha();
                if (actual == null) {
                        nuevo.setPadre(padre);
                        padre.setDerecha(nuevo);
                        size++;
                        return true;                        
                    }
                }
            }
            
        }
        
    }
    
    public NodoArbol getRaiz() {
        return raiz;
    }
    
    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }
    
    public Integer getTamanio() {
        return size;
    }
    
    public void setTamanio(Integer tamanio) {
        this.size = tamanio;
    }
    
    public Integer getAltura() {
        return altura;
    }
    
    public void setAltura(Integer altura) {
        this.altura = altura;
    }
    
    public ListaEnlazada<ListaEnlazada<NodoArbol>> getNiveles() {
        return niveles;
    }
    
    public void setNiveles(ListaEnlazada<ListaEnlazada<NodoArbol>> niveles) {
        this.niveles = niveles;
    }
    
    public ListaEnlazada<NodoArbol> getOrden() {
        return orden;
    }
    
    public void setOrden(ListaEnlazada<NodoArbol> orden) {
        this.orden = orden;
    }
    
}
