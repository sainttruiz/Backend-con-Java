package Basics;

public class increDecre{
    public static void main(String[] args) {
        int x = 5, y;

        y=x++; 

        System.out.println(y);
        System.out.println(x);
        // 5 en Y y 6 en X porque estamos utilizando el postincremento
        
        x= 5;

        y=++x;
        System.out.println(y);
        System.out.println(x);
        //6 y 6 respectivamente porque estamos utiizando el preincremento
        
    }
}