package co.julianvalencia.listaligada;

public class Nodo {
    public int dato;
    Nodo next;
    
    public Nodo(int dato) {
        this.dato   = dato;
        next        = null;
    }

    public Nodo( int dato, Nodo next){
        this.dato = dato;
        this.next = next;
        
    }
}
