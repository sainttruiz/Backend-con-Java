package Basics;
import java.util.InputMismatchException;
import java.util.Scanner;
public class GuessTheNumber{
    public static void main(String[] args) {
        System.out.println("Bienvenido al juego de adivinar un número.");
        System.out.println("He escogido un número entre 0 y 100. ¡Intenta!");


        Scanner sc = new Scanner(System.in);
        int secretNumber=(int)(Math.random()*100); //Porque con el método random() genera números entres [0,1]
        int attempts = 0;
        int number = -1;
        boolean guessed = false;


        while (!guessed){

            System.out.println("Ingresa un número entre 1 y 100: ");
        
            try {
                number=sc.nextInt();
                attempts++;
                if (number>secretNumber){
                    System.out.println("Número ingresado es mayor.");
                }else if(number<secretNumber){
                    System.out.println("Número ingresado es menor.");
                }else{
                    guessed=true;
                    System.out.println("Acertaste, el número era: "+secretNumber);
                    System.out.println("Número de intentos: " +attempts);
                }
            }
                
             catch (InputMismatchException e) {
                System.out.println("Por favor, ingresar un número correcto.");
                sc.next();
            }
        }
        sc.close();
    }
}
