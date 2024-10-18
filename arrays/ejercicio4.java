/**
 * Ordenar un array de nombres en orden alfabético.
 */
package arrays;
import java.util.Scanner;
import java.util.Arrays;
public class ejercicio4{
    //Creación del Array
    public static String[] names;
    //Método para crear la lista que vamos a utilizar
    public static void createList(int n){
        names = new String[n];
        System.out.println(Arrays.toString(names));
        
    }

    //---------------------------------------------------

    /**
     * Método que va a recibir el nombre y lo va a organizar
     * en orden alfabético.
     */
    public static void add(Scanner sc){
        for(int i = 0; i<names.length; i++){
            System.out.print("Ingrese el nombre: ");
            names[i]=sc.next();
        }
        sc.close();
        System.out.print("Lista antes de ordenarla: "+Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Lista después de ordenada: "+Arrays.toString(names));
    }

    //--------------------------------------------------

    /**
     * Método para limpiar el array, ya que al ser
     * un atributo de clase, lo necesitamos usar varias
     * veces
     */
    public static void clear(){
        names=null;
        System.out.println(names);
    }

    //-----------------------------------------------

    //Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al programa que organiza nombres en orden alfabético");
        System.out.print("Ingrese la cantidad de nombres a escribir: ");
        ejercicio4.createList(sc.nextInt()); sc.nextLine();
        ejercicio4.add(sc);
        ejercicio4.clear();
    }
}