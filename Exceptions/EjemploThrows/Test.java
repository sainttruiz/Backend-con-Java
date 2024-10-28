package Exceptions.EjemploThrows;

import java.io.IOException;
import java.io.FileReader;

public class Test{
    public static void main(String[] args) {
        Throws ejemplo = new Throws();

        try {
            FileReader text=ejemplo.leerArchivo("Archivo.txt");
        } catch (IOException e) {
            System.out.println("Ocurrio un problema de entrada y salida: "+e.getMessage());
        }
    }
}