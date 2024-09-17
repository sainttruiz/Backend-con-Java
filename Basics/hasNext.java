package Basics;
import java.util.Scanner;

public class hasNext{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        
        while (sc.hasNext()){
            String word = sc.next();
            if (word.equals("salir")){
                System.out.println("Bye");
                break;  
            }
            else if (!word.matches("[a-zA-Z]+")){
                System.out.println("No ingresaste el tipo de dato correcto...");
                break;
            }
            System.out.println("La cadena que ingresaste: "+word);
        }
        sc.close();
    }
}