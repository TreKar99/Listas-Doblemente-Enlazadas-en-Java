
public class Nodo<E> {
    // El nodo de una doble lista enlazada necesita un puntero al anterior, uno al siguiente y almacenar los datos.
    private Nodo<E> anterior;
    private Nodo<E> siguiente;
    private E data;

    public Nodo<E> getAnterior() {
        return anterior;
    }
    public void setAnterior(Nodo<E> anterior) {
        this.anterior = anterior;
    }
    public Nodo<E> getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo<E> siguiente) {
        this.siguiente = siguiente;
    }
    public E getData() {
        return data;
    }
    public void setData(E data) {
        this.data = data;
    }

    
}