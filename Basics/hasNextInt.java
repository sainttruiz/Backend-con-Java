package Basics;
import java.util.InputMismatchException;
import java.util.Scanner;

public class hasNextInt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            try{
                int num = sc.nextInt();
                if (num==33){
                    break;
                }
                System.out.println("Número ingresado: "+num);
            } catch(InputMismatchException e){
                System.out.println("NO ingresaste un número entero");
                System.out.println("Intenta de nuevo...");
                break;
            }
            sc.nextLine();
        }sc.close();
    }
}