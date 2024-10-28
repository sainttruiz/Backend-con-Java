package Exceptions.EjemploThrow;
public class Throw{
    public void verificarEdad(int edad) throws IllegalArgumentException{
        if (edad<18){
            throw new IllegalArgumentException("La edad debe ser mayor a 18 años");
        }
        System.out.println("Edad verificada: "+edad);
    }
}