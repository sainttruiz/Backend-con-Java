package DataStructures.LinkedList;
import java.util.Scanner;
import java.util.InputMismatchException;;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList newList = new SinglyLinkedList();
        System.out.println("Se pedirán 10 números y estos serán agregados a una linked list");
        for (int i=1;i<=10;i++){
            System.out.println("Ingrese número: ");
            try {
                int j = sc.nextInt();
                newList.add(j);
            } catch (InputMismatchException e) {
                System.out.println("Ingresa un valor correcto.");
            }
        }
        sc.close();
        newList.printList();
    }
}