package Practica1;
public class Persona{
    private String nombre;
    private int edad;
    private boolean esMayorDeEdad;
    private static final int EDAD_ADULTO=18;

    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
        this.esMayorDeEdad= edad>=EDAD_ADULTO;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Es mayor de edad: " + esMayorDeEdad);
    }
    public int duplicarEdad(){
        return edad*2; 
    }
}