package DataStructures.LinkedList;
class AddTwoNumbers{
    public static SinglyLinkedList Solution(SinglyLinkedList L1, SinglyLinkedList L2){
        //Primer recorrido para L1
        Node currentL1 = L1.head;
        String dummy ="";
        while(currentL1!=null){
            dummy= Integer.toString(currentL1.data) + dummy;
            currentL1=currentL1.next;
        }

        //Segundo recorrido para L2
        Node currentL2 = L2.head;
        String bummy = "";
        while(currentL2!=null){
            bummy=Integer.toString(currentL2.data) + bummy;
            currentL2=currentL2.next;
        }
        String resultado=Integer.toString(Integer.parseInt(bummy)+Integer.parseInt(dummy));
        
        SinglyLinkedList newList = new SinglyLinkedList();

        for (int i=resultado.length()-1; i>=0; i--){
            newList.add(resultado.charAt(i)-'0');
        }
        newList.printList();

        return newList;

    }
    public static void main(String[] args) {
        SinglyLinkedList L1 = new SinglyLinkedList();
        SinglyLinkedList L2 = new SinglyLinkedList();
        L1.add(2);
        L1.add(4);
        L1.add(3);
        L1.printList();
        L2.add(5);
        L2.add(6);
        L2.add(4);
        L2.printList();
        Solution(L1, L2);
    }
}