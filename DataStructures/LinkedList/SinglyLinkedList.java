package DataStructures.LinkedList;
class SinglyLinkedList{
    Node head;

    public void add(int data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
        }else{
            Node current = head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void remove(int data){
        if(head==null)return;

        //Si el nodo a eliminar es el primero.
        if(head.data==data){
            head=head.next;
            return;
        }

        Node current = head;
        while(current.next!=null && current.next.data!=data){
            current=current.next;
        }

        if (current.next!=null){
            current.next=current.next.next;
        }

    }

    public void printList(){
        Node current = head;
    while (current != null) {
        System.out.print(current.data);  // Usamos print() en vez de println() para que no haga saltos de línea
        current = current.next;
        if (current != null) {
            System.out.print(" -> "); // Solo imprime "->" si no es el último nodo
        }
    }
    System.out.println(" -> Null"); // Para finalizar con el Null en la misma línea
    }
}