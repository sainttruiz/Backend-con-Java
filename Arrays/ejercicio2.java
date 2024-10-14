/**
 * Crear un array de 10 números enteros, asignarles valores y encontrar el número mayor.
 */
package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class ejercicio2{

    public static float[] numeros = new float[10];

    public static void add(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<numeros.length;i++){
            System.out.println("Ingrese número: ");
            float k = sc.nextFloat();
            numeros[i]=k;
            System.out.println(Arrays.toString(numeros));
        }
        sc.close();
    }

    public static float max(){
        float max=numeros[0];
        for(float n:numeros){
            if (n>max){
                max=n;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido al programa!!");
        System.out.println("Se pediran 10 número y al final se devolverá el mayor de ellos");
        ejercicio2.add();
        float max = ejercicio2.max();
        System.out.println("El número mayor es: " + max);
    }
}