package Basics;
import java.util.Scanner;

public class operadores{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese primer número: ");
        float num1 = sc.nextFloat();
        System.out.println("Ingrese segundo número: ");
        float num2 = sc.nextFloat();
        sc.nextLine();
        sc.close();

        System.out.println("El resultado de la suma es: " + (num1+num2));
        System.out.println("El resultado de la resta es: "+ (num1-num2));
        System.out.println("El resultado de la multiplicación es: "+(num1*num2));
        System.out.println("El resultado de la diisión es: "+(num1/num2));
        System.out.println("El restante de la división es: "+(num1%num2));
    }
}