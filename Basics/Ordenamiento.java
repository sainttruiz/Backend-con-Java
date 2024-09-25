package Basics;
import java.util.Scanner;
import java.util.ArrayList;
public class Ordenamiento{
    public int a,b,c;

    public Ordenamiento(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public ArrayList<Integer> Sort(){

        ArrayList<Integer> sorted = new ArrayList<>();
        if (this.a<this.b){
            int temp=this.a;
            this.a=this.b;
            this.b=temp;
        }
        if (this.a<this.c){
            int temp = this.a;
            this.a=c;
            this.c=temp;
        }
        if (this.b<this.c){
            int temp = this.b;
            this.b=this.c;
            this.c=temp;
        }
        sorted.add(this.a);
        sorted.add(this.b);
        sorted.add(this.c);

        return sorted;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese primer número: ");
        int a = sc.nextInt();
        System.out.println("Ingrese segundo número: ");
        int b = sc.nextInt();
        System.out.println("Ingrese tercer número: ");
        int c = sc.nextInt();
        sc.close();
        Ordenamiento example = new Ordenamiento(a,b,c);
        System.out.println("Números ordenados: " + example.Sort());
        
    }
}