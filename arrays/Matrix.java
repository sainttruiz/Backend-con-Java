package arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Matrix{
    public int[][] matrix1;
    public int[][] matrix2;
    public int[][] result;

    public Matrix(int i, int j, int k, int l){
        this.matrix1 = new int[i][j];
        this.matrix2 = new int[k][l];
        this.result = new int[i][l];

    }
    public void fill(Scanner sc){
        for (int k = 0 ; k<matrix1.length;k++){
            for (int i = 0; i<matrix1[k].length; i++){
                System.out.print("->");
                int j = sc.nextInt();
                matrix1[k][i]=j;
                System.out.println(Arrays.deepToString(matrix1));
            }
        }
        for (int k = 0 ; k<matrix2.length;k++){
            for (int i = 0; i<matrix2[k].length; i++){
                System.out.print("->");
                int j = sc.nextInt();
                matrix2[k][i]=j;
                System.out.println(Arrays.deepToString(matrix2));
            }
        }
        
    }
    public void times(){
        //Utilizando la formula de multiplicación de matrices
        //C[i][j]= p-1∑k=0 A[i][k]×B[k][j] donde p es el número de cantidad columnas de A o filas de B
        for (int i=0;i<result.length;i++){
            for (int j = 0 ; j<result[i].length;j++){
                result[i][j]=0;
                for (int k = 0 ; k<matrix1[0].length; k++){
                    result[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al multiplicador de matrices");
        boolean valid = true;
        while (valid){
            System.out.print("Desea usar el programa? SI/NO: -> ");
            String ans = sc.next();
            ans=ans.toUpperCase();
            switch (ans) {
                case "SI":
                try {
                    System.out.print("Ingrese la cantidad de filas de la matriz 1:");
                    int i = sc.nextInt();
                    System.out.print("Ingrese la cantidad de columnas de la matriz 1:");
                    int j = sc.nextInt();
                    System.out.print("Ingrese la cantidad de filas de la matriz 2:");
                    int k = sc.nextInt();
                    System.out.print("Ingrese la cantidad de columnas de la matriz 2:");
                    int l = sc.nextInt();
                    if (j!=k){
                        System.out.println("Recuerde que (n*m) . (k*l) donde m=k");
                        System.out.println("Vuelva a intentarlo...");
                        
                    }else{
                        Matrix matrix = new Matrix(i, j, k, l);
                        System.out.println(Arrays.deepToString(matrix.matrix1));
                        System.out.println(Arrays.deepToString(matrix.matrix2));
                        matrix.fill(sc);
                        matrix.times();
                        System.out.println("Resultado de la multiplicación: ");
                        System.out.println(Arrays.deepToString(matrix.result));
                    }
    
                } catch (InputMismatchException e) {
                    System.out.println("Los valores deben ser numéricos");
                }
                    break;
            
                case "NO":
                    System.out.println("Regrese luego...");
                    valid=false;
                    continue;
                
                default:
                System.out.println("Debe ingresar un comando valido");
                    break;
            }
  
        }sc.close();
    }
        
    }
