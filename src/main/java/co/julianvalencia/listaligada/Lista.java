package co.julianvalencia.listaligada;

public class Lista implements ILista{
    private Nodo inicio;
    private int cant;
    
    public int getCant(){
        return cant;
    }

    public Lista(){
        inicio  = null;
        cant    = 0;
    }

    @Override
    public void insertar(int elemento) {
        inicio = new Nodo(elemento , inicio );
        cant++;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int eliminar(int elemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean buscar(int elemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String recorrer() {

        String cadena = "";
        Nodo aux = inicio;
        while ( aux!=null ) {
           cadena += aux.dato + " , ";
            aux = aux.next;
        }
        return cadena; 
    }

    @Override
    public boolean vaciar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int tamaño() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}