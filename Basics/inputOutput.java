package Basics;
import java.util.Scanner;
public class inputOutput{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = entrada.nextInt();
        System.out.println("Número ingresado: " + numero);

        
        System.out.print("Ingresa un número decimal: ");
        double decimal = entrada.nextDouble();
        System.out.println("Número decimal ingresado: " + decimal);

        
        entrada.nextLine();  

        
        System.out.print("Ingresa una línea de texto: ");
        String texto = entrada.nextLine();
        System.out.println("Texto ingresado: " + texto);

        System.out.println("Ingresa una cadena: ");
        String palabra = entrada.next();
        System.out.println("Tu cadena de texto es : " + palabra);

        
        entrada.close();
    }
}