/**
 * Crear una matriz 2D, rellenarla con valores aleatorios y luego imprimirla usando Arrays.deepToString().
 */
package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5{
    
    public static int[][] createArray(int i, int j){
        if (i<=0 || j<=0){
            System.out.println("Lo valores deben ser positivos, se creará un Array 1x1 por defecto");
            return new int[1][1];
        }
        return new int[i][j];
    }
    public static int[][] fill(int[][] matrix){
        for (int k = 0; k<matrix.length; k++){
            for (int l = 0; l<matrix[k].length; l++){
                matrix[k][l]=(int)(Math.random()*100);
            }
        }
        return matrix;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean play = true;
        System.out.println("Bienvenido al rellenador de matrices");

        while(play){
            
            System.out.println("¿Desea rellenar?");
            System.out.println("SI/NO");

            String valid = sc.next().toUpperCase();

            switch (valid) {

                case "SI":
                    System.out.print("Ingrese la cantidad de filas del array: ");
                    int i = sc.nextInt();
                    System.out.print("Ingrese la cantidad de columnas del array: ");
                    int j = sc.nextInt();
                    int[][] matrix=ejercicio5.createArray(i, j);
                    matrix=ejercicio5.fill(matrix);
                    System.out.println("Resultado aleatorio: "+Arrays.deepToString(matrix));
                    break;

                case "NO":
                    System.out.println("Bye bye"); play=false;
                    break;
            
                default:
                    System.out.println("Ingrese un comando valido!!");
                    break;
            }   
        }
        sc.close();
        
    }

}