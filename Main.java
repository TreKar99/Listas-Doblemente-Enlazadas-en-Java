public class Main {
    public static void main(String[] args) throws Exception {
        // Para ver fácilmente el resultado usaremos objetos de tipo primitivo int.
        DoublyLinkedList<Integer> lista = new DoublyLinkedList<Integer>();
        Integer[] nums = {1,2,3,4,5};

        añadirNodosEjemploInt(lista, nums); // Añadimos elementos de ejemplo

        try {lista.borrar(2);} catch (Exception e) {System.out.println("Elemento no encontrado");}      // Probamos a borrar.

        lista.consultar();                  // Consultamos de manera visual la lista doble enlazada.

        System.out.println("La lista tiene " + lista.longitud() + " elementos.");
    }

    public static void añadirNodosEjemploInt(DoublyLinkedList<Integer> lista, Integer[] nums) {
        for(Integer i : nums) {
            lista.añadir(i);
        }
    }
}
