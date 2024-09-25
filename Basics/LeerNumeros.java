package Basics;
import java.util.Scanner;
public class LeerNumeros{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número");
        int a = sc.nextInt();
        sc.nextLine();
        sc.close();
        String b = Integer.toString(a);
        int contador=0;
        for (String char_ : b.split("") ) {
            contador+=1;
        }
        System.out.println("El número tiene " + contador + " cifras");
    }
}