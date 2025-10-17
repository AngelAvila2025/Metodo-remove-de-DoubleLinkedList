package mx.edu.ejemplo;

public class DoubleLinkedList {
    private Node head;

    // Agrega un elemento al final de la lista
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Imprime la lista completa
    public void printList() {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Elimina el primer nodo que contenga el valor indicado
    public void remove(int value) {
        // 1. Verificar si la lista está vacía
        if (head == null) {
            System.out.println("La lista está vacía, no se puede eliminar.");
            return;
        }

        Node current = head;

        // 2. Buscar el nodo con el valor a eliminar
        while (current != null && current.data != value) {
            current = current.next;
        }

        // 3. Si no se encontró el valor
        if (current == null) {
            System.out.println("Valor " + value + " no encontrado en la lista.");
            return;
        }

        // 4. Si el nodo a eliminar es el head
        if (current == head) {
            head = current.next;
            if (head != null) {
                head.prev = null; // el nuevo head no tiene anterior
            }
        } else {
            // 5. Si el nodo a eliminar no es el primero
            current.prev.next = current.next;
        }

        // 6. Si el nodo a eliminar no es el último
        if (current.next != null) {
            current.next.prev = current.prev;
        }

        System.out.println("Elemento " + value + " eliminado correctamente.");
    }
}