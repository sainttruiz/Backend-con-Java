package Exceptions;

/**Lo que hacemos es que creamos una clase que va a heredar
 * de la superClase Exception.
 */
class MiExcepcion extends Exception{
    public MiExcepcion(String mensaje){
        //Declaramos el constructor pasando el argumento mensaje al SuperConstructor
        //Más adelante conoceremos más sobre herencia en OOP
        super(mensaje);
    }
}
public class ExcepcionsTests{
    public static void lanzarExcepcion() throws MiExcepcion{
        /**Cuando se declara un método con el throws se le está diciendo 
         * a cualquier otro código que lo use que debe estar preparado para manejar esas excepciones.
         * Lo anterior ya sea con bloque try-catch o propagándolas con throws en su propio método.
         */
        throw new MiExcepcion("Este es un error personalizado");
    }
    public static void main(String[] args) {
        try {
            /**Como en el método lanzarExcepcion se declaró throws 
             * se debe declarar un tryCatch obligatoriamente
            */
            lanzarExcepcion();
        } catch (MiExcepcion e) {
            System.out.println("Excepción personalizada capturada: "+e.getMessage());
        }
    }
}