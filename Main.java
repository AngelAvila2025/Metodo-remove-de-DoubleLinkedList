

public class Main {
    public static void main(String[] args) {
        mx.edu.ejemplo.DoubleLinkedList list = new mx.edu.ejemplo.DoubleLinkedList();

        // Agregar elementos
        list.add(10);                                                          list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Lista original:");
        list.printList();

        // Eliminar algunos elementos
        list.remove(30); // eliminar en medio
        list.remove(10); // eliminar el primero
        list.remove(50); // eliminar el último

        System.out.println("\nLista después de eliminar:");
        list.printList();
    }
}