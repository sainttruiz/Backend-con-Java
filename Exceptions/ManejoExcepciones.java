package Exceptions;

//Imortación del paquete IO
import java.io.FileReader;
import java.io.IOException;
public class ManejoExcepciones{
    public static void main(String[] args) {
        //Creamos el objetos que leerá el archivo
        FileReader file = null;

        try {
            /**Tratamos de crear el objeto file pasandole
             * como argumento a su constructor la dirección del
             * archivo.
             */
            file = new FileReader("Exceptions/ArchivoEjemplo.txt");
            System.out.println("Archivo abierto exitosamente");
        } catch (IOException e) {
            //Atrapamos la exepción, imprimiendo también el mensaje de error.
            System.out.println("El archivo no fue encontrado: " + e.getMessage());
        }finally{
            //Agregamos el bloque finally para cerrar recursos
            try{
                //Si existe el archivo lo cerramos
                if (file!=null){
                    file.close();
                    System.out.println("Archivo cerrado exitosamente");
                }
            }catch(IOException e){
                //Si no existe (por ende no se cierra) lanzamos la excepción.
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
}