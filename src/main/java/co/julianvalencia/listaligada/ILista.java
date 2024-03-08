package co.julianvalencia.listaligada;

public interface ILista {
    public void insertar(int elemento);
    public int eliminar(int elemento);
    public boolean buscar(int elemento);
    public String recorrer();
    public boolean vaciar();
    public int tamaño();
}
