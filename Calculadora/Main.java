package Calculadora;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la operación a evaluar");
        String op=sc.next();
        System.out.println(Eval.eval(op));
        sc.close();
    }
}