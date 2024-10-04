package Basics;
import java.util.Scanner;
public class Factorial{
    public int n;
    public long r=1;
    
    public Factorial(int n){
        this.n=n;
    }
    public long Calculate(){
        for(int i=1;i<=n;i++){
            this.r*=i;
        }
        return this.r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a calcular el factorial del número que ingreses.");
        System.out.println("Ingresa el número: ");
        int n = sc.nextInt();
        sc.close();
        Factorial example = new Factorial(n);
        System.out.println("El resultado es: " + example.Calculate());
    }
}