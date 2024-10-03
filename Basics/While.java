package Basics;
public class While{
    public static void main(String[] args) {
        int i = 0;

        while (i<=10){System.out.println(i++);}
        System.out.println("La i terminó en: " + i);

//-----------------------------------------------------
        int j=20;
        /**A pesar de que el 20 es mayor que el 10, se ejecutará al menos una vez por la
        estructura del do-while*/
        do{System.out.println(j);}while(j<10);
    }
}