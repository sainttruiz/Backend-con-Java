package Exceptions.EjemploThrows;
import java.io.FileReader;
import java.io.IOException;

public class Throws{
    public void leerArchivo() throws IOException{
        FileReader file = new FileReader("Archivo.txt");
        if(file==null){throw new IOException("Archivo no encontrado");}
        
    }
}