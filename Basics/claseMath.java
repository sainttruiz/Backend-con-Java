package Basics;

import java.util.Scanner;

public class claseMath{
    //Aquí voy a poner lo único bueno de esta clase
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    while (sc.hasNext()){
        String word = sc.next();
        if (word.equals("salir")){
            break;
        }
        System.out.println(Math.random());
    }
    sc.close();
    
    }
}