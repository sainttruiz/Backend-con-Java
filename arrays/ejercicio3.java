/**
 * Crear una matriz de 3x3 que represente un tablero de juego de tres en raya, y rellenarla con "X" o "O".
 */
package arrays;
import java.util.Arrays;
import java.util.Scanner;
 public class ejercicio3{
    //Declaraión de la matriz
    public static char[][] matrix = new char[3][3];

    //Declaración del método de relleno
    public static void add(Scanner sc){
        for(int i = 0; i<3;i++){
            for(int j=0; j<3;j++){
                boolean valid= false;
                char s= '?';
                while(!valid){
                    System.out.println("Ingrese la letra para la posición ["+i+"] ["+j+"]");
                    s = sc.next().toUpperCase().charAt(0);
                    if(s=='X' || s=='O'){
                        valid=true;
                    }else{
                        System.out.println("Entrada invalida. Intente de nuevo.");
                    }
                }
                matrix[i][j]=s;
                System.out.println(Arrays.deepToString(matrix));
            }
        }
        
    }

    //Declaración del método de limpieza de la matriz
    public static void clean(){
        for(int i = 0; i<3;i++){
            for(int j=0; j<3;j++){
                matrix[i][j]='?'; 
            }
        }
        System.out.println("Limpiando la matriz");
        System.out.println(Arrays.deepToString(matrix));
    }

    //Declaración del método principal
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Bienvenido al juego de rellenar una matriz con X y O");
        boolean play = true;
        while (play){
            System.out.println("Desea jugar?");
            System.out.println("SI / NO");
            String conf = ss.next();
            conf=conf.toUpperCase();
            switch (conf) {
                case "SI":
                    ejercicio3.add(ss);
                    ejercicio3.clean();
                    break;
                case "NO":
                    System.out.println("Bye bye");
                    play=false;
                    break;
                default:
                    System.out.println("No se ingresó ningún argumento valido.");
                    break;
            }
        }
        ss.close();
    }
 }