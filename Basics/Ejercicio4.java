package Basics;
import java.util.Scanner;
/**Pedir números hasta que se teclee uno negativo y mostrar cuántos nḿeros
 * se han introducido
 */
public class Ejercicio4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int i = sc.nextInt();
        int cont=1;
        while (i>=0){
            System.out.println("Se han ingresado "+cont+" números");
            System.out.println("Ingrese un número: ");
            i=sc.nextInt();
            cont++;
        }
        sc.close();
    }
}