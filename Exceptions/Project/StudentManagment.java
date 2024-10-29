package Exceptions.Project;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.UUID;
public class StudentManagment{
    private static ArrayList<Student> students;

    public void addStudent(String name, int age) throws IllegalArgumentException{
        String newID=idGenerator();
        if (age < 0 || name==null ){
            throw new IllegalArgumentException("Error de entrada de datos");
        }
        for (Student s : students){
            if (s.getID()==newID){
                throw new IllegalArgumentException("Error en la creación del ID");
            }
        }
        Student s = new Student(name, age, newID);
        students.add(s);
    }

    public void removeStudent(String ID) throws NoSuchElementException{
        for (Student s : students) {
            if (s.getID()==ID){
                students.remove(s);
            }
        }
        throw new NoSuchElementException("No se encontró el objeto.");
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

    public String idGenerator(){
        return UUID.randomUUID().toString();
    }

}