
public interface ListInterface<E> {

    //Método para añadir un nuevo nodo con datos.
    public void añadir(E e);

    //Método para borrar un nodo según si encuentra ese dato.
    public void borrar(E e) throws Exception;

    //Método para comprobar si existe el objeto en la lista.
    public boolean buscar(E e);

    //Método para obtener un nodo de la lista según un dato.
    public Nodo<E> getElemento(E e) throws Exception;

    //Método para comprobar si la lista está vacía.
    public boolean vacía();

    //Método para obtener la longitud de la lista.
    public int longitud();

}
