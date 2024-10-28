package Exceptions.EjemploThrow;
public class Test{
    public static void main(String[] args) {
        Throw ejemplo = new Throw();
        try {
            int edad = 17;
            ejemplo.verificarEdad(edad);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        
}
    }
    