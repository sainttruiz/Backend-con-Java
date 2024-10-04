package Basics;
/**Pedir números hasta que se introduzca uno negativo,
 * y calcular la media.
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class Average{
    public static double Calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora de promedio.");
        System.out.println("Ingresa una x cantidad de números y se calculará el promedio.");
        System.out.println("Si se ingresa un número negativo el programa para.");
        int cont =0;
        boolean val = true;
        int i = 0;
        int j = 0;

        while (val){
            System.out.println("Ingrese un número: ");

            try {
                j=sc.nextInt();
                if (j>=0){
                    i+=j;
                    cont++;
                }else{val=false;}
            } catch (InputMismatchException e) {
                System.out.println("Por favor ingrese un valor permitido (Número).");
                sc.next();//Elimina todas las entradas para iniciar de cero.
            }
        }
        sc.close();
        return (double)(i/cont);
    }
    public static void main(String[] args) {
        System.out.println("El promedio de todos los números que ingresaste es: "+Average.Calculate());
    }
}