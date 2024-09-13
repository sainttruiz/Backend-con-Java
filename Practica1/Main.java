package Practica1;
public class Main{
    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora("Casio");
        Persona persona1 = new Persona("Juan", 20);

        int suma1= calculadora1.sumar(10,5);
        int resta1= calculadora1.restar(10,3);
        System.out.println("Suma: " + suma1);
        System.out.println("Resta: " + resta1);
        System.out.println(calculadora1.mostrarNombre());

        persona1.mostrarDatos();
        System.out.println("Edad duplicada: " + persona1.duplicarEdad());
    }

}