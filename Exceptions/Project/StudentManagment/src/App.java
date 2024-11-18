import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;


public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagment manager = new StudentManagment();

        //Agregar a estudiantes por defecto
            manager.addStudent("Juan", 19);
            manager.addStudent("Santiago", 20);
            manager.addStudent("Julieta", 25);
            manager.addStudent("Mateo", 23);
            manager.addStudent("Franco", 19);
            manager.addStudent("Esteban", 19);
            manager.addStudent("Karen", 24);
            manager.addStudent("Oscar", 45);
            manager.addStudent("Alberto", 19);
        


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
            try {
                int i = sc.nextInt();
                switch (i) {
                    case 1:
                        System.out.println("Ingrese el nombre y la edad del estudiante. El ID se generará automáticamente.");
                        try {
                            System.out.print("Nombre -> ");
                            String name = sc.next();
                            System.out.print("Edad -> ");
                            int edad = sc.nextInt();
                            manager.addStudent(name, edad);
                            manager.printStudents();
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: "+e.getMessage());
                        }
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.print("Ingrese el ID del estudiante a eliminar -> ");
                        try {
                            String ID = sc.next();
                            manager.removeStudent(ID);
                        }catch (NoSuchElementException a) {
                            System.out.println("Error-> "+a.getMessage());
                        }catch(NullPointerException o){
                            System.out.println("Error-> "+o.getMessage());
                        }
                        break;
                    case 3:

                        break;
                    case 4:
                        manager.printStudents();
                        break;
                    case 5:
                        System.out.println("Bye bye.");
                        valid = false;
                        break;
                    default:
                        System.out.println("Ingrese una opción valida.");
                        break;}
            }catch (InputMismatchException e) {
                System.out.println("Error: "+ e.getMessage());
            }
            

        }
    }
}