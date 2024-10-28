package Exceptions.EjemploThrows;

import java.io.IOException;

public class Test{
    public static void main(String[] args) {
        Throws ejemplo = new Throws();

        try {
            ejemplo.leerArchivo();
        } catch (IOException e) {
            System.out.println("Ocurrio un problema de entrada y salida: "+e.getMessage());
        }
    }
}