package Basics;
public class variables{
    public static void main(String[] args) {
        byte byte_=127;
        short short_=32767;
        int int_= -2147483648;
        long long_ =92233720;
        float float_=3.45f;
        double double_=3.45;
        char char_='a';
        boolean boolean_ = true;
        System.out.println("Tipos de datos primitivos --> ");
        System.out.println("Numero entero " + byte_);
        System.out.println("Número short " + short_);
        System.out.println("Número entero " + int_);
        System.out.println("Número long " + long_);
        System.out.println("Número decimal "+ float_);
        System.out.println("Número double " + double_);
        System.out.println("Dato caracter: " + char_);
        System.out.println("Dato boolean: " + boolean_);

        Integer numero = 10;
        String cadena= "Hola, qué tal?";

        System.out.println("Tipos de datos no primitivos -->");
        System.out.println("Entero de tipo no primitivo: " + numero);
        System.out.println(numero.getClass());
        System.out.println("Una cadena: " + cadena);
        System.out.println(cadena.getClass());
    }
}