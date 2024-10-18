/**
 * Leer 5 números, guardarlos en un arreglo
 * y mostrarlos en el mismo orden introducido
 */

package arrays;
import java.util.Scanner;

public class ejercicio1{
    public static int[] numeros = new int[5];

    public static int[] add(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length;i++){
            System.out.println("Ingresa número: ");
            int k = sc.nextInt();
            numeros[i]=k;
        }
        sc.close();
        return numeros;
    }

    public static void print(){
        for(int i:numeros){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ejercicio1.add();
        ejercicio1.print();
    }
}