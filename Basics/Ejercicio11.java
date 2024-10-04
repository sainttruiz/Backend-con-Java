package Basics;
public class Ejercicio11{
    public static void main(String[] args) {
        long r = 1;

        for(int i=1;i<=20;i++){
            if(i%2!=0){
                r*=i;
            }
        }

        System.out.println("El producto de los diez primeros números impares es: " + r);
    }
}