package co.julianvalencia.listaligada;

public class ListaLigada {

    public static void main(String[] args) {
        
        Lista l = new Lista();
        l.insertar(15);
        l.insertar(25);
        l.insertar(16);
        l.insertar(32);
        System.out.println( l.getCant() );
        System.out.println( l.recorrer() );
    }
}
