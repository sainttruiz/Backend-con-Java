package Practica1;
public class Calculadora implements OperacionesBasicas{
    private String name;

    public Calculadora(String name){
        this.name=name;
    }
    
    public int sumar(int a, int b){
        return a+b;
    }

    public int restar(int a, int b){
        return a-b;
    }

    public String mostrarNombre(){
        return name;
    }
}