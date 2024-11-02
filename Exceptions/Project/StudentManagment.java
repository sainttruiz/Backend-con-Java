package Exceptions.Project;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.UUID;
public class StudentManagment{
    private static ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, int age) throws IllegalArgumentException{

        String newID=idGenerator();
        if (age < 0 || name==null ){
            throw new IllegalArgumentException("Error de entrada de datos: Revisa la edad o el nombre");
        }
        // if (students.get(0)!=null){
        //     for (Student s : students){
        //         if (s.getID()==newID){
        //             throw new IllegalArgumentException("Error en la creación del ID");
        //         }
        //     }
        // }
        else{students.add(new Student(name, age, newID));}
    }

    public void removeStudent(String ID) throws NoSuchElementException, NullPointerException{
        for (Student s : students) {
            if(s==null){
                throw new NullPointerException("A la lista le falta un estudiante o está vacía.");
            }
            if (s.getID()==ID){
                System.out.println("Estudiante con ID :"+ID+" eliminado.");
                students.remove(s);
                continue;
            }
                
        }throw new NoSuchElementException("No se encontró el objeto.");
        
    }

    public void findStudent(String ID) throws NoSuchElementException{
        for (Student s : students) {
            if (s.getID()==ID){
                System.out.println(s.toString());
            }
        }
        throw new NoSuchElementException("No se encontró el objeto.");
    }

    public void printStudents(){
        students.forEach(System.out::println);
    }

    public static String idGenerator(){
        return UUID.randomUUID().toString();
    }

}