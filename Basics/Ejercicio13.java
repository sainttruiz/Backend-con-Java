/**Pedir 10 nuḿeros. Mostrar la media de los números positivos,
 * la media de los números negativos y la cantidad de ceros.
 */
package Basics;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Ejercicio13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contPost=0;
        int contNegt=0;
        int sumPost=0;
        int sumNegt=0;
        int contZero=0;
        for(int i = 1; i<=10;i++){
            System.out.println("Ingrese número: ");
            try {
                int j=sc.nextInt();
                if (j==0){
                    contZero+=1;
                }else if(j>0){
                    sumPost+=j;
                    contPost++;
                }else{
                    sumNegt+=j;
                    contNegt++;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa un valor númerico.");
                sc.next();
            }
        }
        sc.close();
        if(contPost!=0){System.out.println("El promedo de los números positivos: "+(double)(sumPost/contPost));}
        else{System.out.println("No se puede sacar el promedio a los números positivos");}
        if(contNegt!=0){System.out.println("El promedio de los números negativos: "+(double)(sumNegt/contNegt));}
        else{System.out.println("No se puede sacar el promedio a los números negativos");}
        
        System.out.println("La cantidad de ceros es: "+ contZero);
    }
}