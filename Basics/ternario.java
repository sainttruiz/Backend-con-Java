package Basics;
import java.util.Scanner;

public class ternario{
    public static void main(String[] args) {
        //if-else
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa los dos números...");

        int x = sc.nextInt();
        int y = sc.nextInt();

        sc.nextLine();
        sc.close();

        boolean isMax = (x>y) ? true : false;

        String result = (isMax) ? "El primer número que ingresaste es mayor" : "El primero número que ingresaste es menor";

        System.out.println(result);


    }
}