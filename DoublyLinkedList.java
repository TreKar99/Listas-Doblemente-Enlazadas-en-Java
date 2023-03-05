
public class DoublyLinkedList<E> implements ListInterface<E>{

    // La lista se basará en un nodo inicial y uno final.
    private Nodo<E> primero;
    private Nodo<E> último;
    private int elem = 0;

    //Método para añadir un nuevo nodo con datos.
    public void añadir(E e) {
        Nodo<E> nuevo = new Nodo<E>();
        nuevo.setData(e);

        if(this.vacía()) {               // Si lista vacía primero y último primer elemento.
            primero = nuevo;
            último = primero;
        }
        else {
            Nodo<E> aux = último;
            último = nuevo;
            último.setAnterior(aux);
            aux.setSiguiente(último);
        }
        elem++;
    }

    //Método para borrar un nodo según si encuentra ese dato.
    public void borrar(E e) throws Exception {
        Nodo<E> aux1, aux2;
        
        if(primero != null) {
            if(primero.getData() == e) {                       // Caso <E> = primero. Primero -> segundo
                primero = primero.getSiguiente();          
                if(primero != null) primero.setAnterior(null);           // Borramos elemento (borrar puntero).
                if(último.getData() == e){                    // Caso <E> = primero/último (1 elemento)
                    último = último.getAnterior();             
                    if(último != null) último.setSiguiente(null);         // Borramos elemento (borrar puntero).
                    elem--;
                } else elem--;
            }
            else if(último.getData() == e) {                       // Caso <E> = último. Último -> penúltimo
                último = último.getAnterior();             
                último.setSiguiente(null);         // Borramos elemento (borrar puntero).
                elem--;
            }
            else {
                try {
                    aux1 = getElemento(e);                    // Intentamos obtener el nodo según objeto <E>
                    aux2 = aux1.getAnterior();                // Cambiamos punteros para borrar nodo.
                    aux2.setSiguiente(aux1.getSiguiente());   
                    aux2 = aux1.getSiguiente();
                    aux2.setAnterior(aux1.getAnterior());
                    elem--;
                } catch (Exception exception) {
                    throw exception;
                }
            }
            
        }
        else throw new Exception("Lista vacía");
    }

    //Método para comprobar si existe el objeto en la lista.
    public boolean buscar(E e) {
        Nodo<E> aux = primero;

        if(!this.vacía()) {
            while(aux != null) {
                if(aux.getData() == e) return true;
                else aux = aux.getSiguiente();
            }
        } return false;
    }

    //Método para obtener un nodo de la lista según un dato.
    public Nodo<E> getElemento(E e) throws Exception {
        Nodo<E> aux = primero;

        if(!this.vacía()) {
            while(aux != null) {
                if(aux.getData() == e) return aux;
                else aux = aux.getSiguiente();
            }
        } throw new Exception("No existe el elemento");
    }

    //Método para comprobar si la lista está vacía.
    public boolean vacía() {
        return(primero == null);    // Si primero = null -> lista vacía.
    }

    //Método para obtener la longitud de la lista.
    public int longitud() {
       return elem;
    }

    //Método para ver la aplicación de la lista doblemente enlazada.
    public void consultar() {
        Nodo<E> aux = primero;
        String datos = "";
        while(aux != null){
            datos = datos + aux.getData() + "->";
            aux = aux.getSiguiente();
        }
        System.out.println(datos);

        aux = último;
        datos = "";
        while(aux != null) {
            datos = datos + aux.getData() + "->";
            aux = aux.getAnterior();
        }
        System.out.println(datos);

    }


}
