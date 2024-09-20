package practicasBasicas;
import java.util.Scanner;

public class ejercicio1{
    /**Hacer un programa que calcule e imprima
     * el salario semanal de un empleado a partir
     * de sus horas semanales trabajadas y de su salario/hra
     * salario/hora=$5.416
     */
    final static int SALARIO_HORA = 5416;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salario;
        System.out.println("Escriba en pantalla el número total de horas trabajadas esta semana: ");
        int horas = sc.nextInt();
        sc.nextLine();
        sc.close();

        salario = (horas*ejercicio1.SALARIO_HORA);
        System.out.println("Su salario es de: "+salario);
    }

}
