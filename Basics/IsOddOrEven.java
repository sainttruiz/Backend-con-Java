package Basics;
import java.util.Scanner;
public class IsOddOrEven{
    public static String calculate(int i){
        if (i%2==0){return "Es par";}else{return "Es impar";}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int j = sc.nextInt();
        while (j!=0){System.out.println(IsOddOrEven.calculate(j));
        System.out.println("Ingrese un número: ");
        j=sc.nextInt();}
        sc.close();
    }
}
