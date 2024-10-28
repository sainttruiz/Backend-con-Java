package Exceptions.EjemploThrows;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Throws{
    public FileReader leerArchivo(String route) throws IOException{
        
        try {
            FileReader file = new FileReader(route);
            return file;
        } catch (FileNotFoundException e) {
            throw new IOException("Archivo no encontrado", e);
        }
        
    }
}