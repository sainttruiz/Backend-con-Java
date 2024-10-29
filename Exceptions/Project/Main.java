package Exceptions.Project;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagment manager = new StudentManagment();
        boolean valid = true;
        System.out.println("Bienvenido al gestor de estudiantes");
        while (valid){
            System.out.println("¿Que opcion desea ingresar?");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Buscar estudiante por ID");
            System.out.println("4. Listar todos los estudiantes");
            System.out.println("5. Salir.");
            System.out.print("Ingrese opcion (numero) -> ");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Bye bye.");
                    valid = false;
                    break;
                default:
                    break;
            }
        }
    }
}