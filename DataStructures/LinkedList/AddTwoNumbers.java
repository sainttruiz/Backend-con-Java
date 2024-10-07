package DataStructures.LinkedList;
import java.util.Scanner;
class AddTwoNumbers{
    public static SinglyLinkedList Solution(SinglyLinkedList L1, SinglyLinkedList L2){
        //Primer recorrido para L1
        SinglyLinkedList newList = new SinglyLinkedList();
        Node currentL1 = L1.head;
        Node currentL2 = L2.head;

        int carry=0;

        while( currentL1 != null || currentL2 != null || carry!=0){
            int val1=(currentL1!=null) ? currentL1.data : 0;
            int val2=(currentL2!=null) ? currentL2.data : 0;

            int sum = val1+val2+carry;
            carry =sum/10;
            int digit=sum%10;

            newList.add(digit);

            if (currentL1 != null) currentL1 = currentL1.next;
            if (currentL2 != null) currentL2 = currentL2.next;
        }
        
        newList.printList();

        return newList;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList L1 = new SinglyLinkedList();
        SinglyLinkedList L2 = new SinglyLinkedList();
        System.out.println("Bienvenido al programa que ingresadas dos listas enlazadas devuelva un resultado de la siguiente manera:");
        System.out.println("Input: l1 = [2,4,3], l2 = [5,6,4]");
        System.out.println("Output: [7,0,8]");
        System.out.println("Explanation: 342 + 465 = 807.");
        System.out.println("Se va a pedir las longitudes de las Linked List a ingresar y se dara la Linked List de resultado.");
        System.out.println("Ingrese la longitud de la lista 1: ");
        int i = sc.nextInt();
        for (int x = 1; x<=i;x++){
            System.out.println("Ingrese número: ");
            L1.add(sc.nextInt());
            L1.printList();
            L2.printList();
        }
        System.out.println("Ingrese la longitud de la lista 2: ");
        int j = sc.nextInt();
        for (int x = 1; x<=j;x++){
            System.out.println("Ingrese número: ");
            L2.add(sc.nextInt());
            L1.printList();
            L2.printList();
        }
        sc.nextLine();
        sc.close();
        Solution(L1, L2);
    }
}