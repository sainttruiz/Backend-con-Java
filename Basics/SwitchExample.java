package Basics;
import java.util.Scanner;

public class SwitchExample{
    public int horasTrabajadas;
    public int salario;

    public SwitchExample(int horas){
        this.horasTrabajadas=horas;
    }

    public int calcularSalario(){
        int horas=this.horasTrabajadas;
        if (horas<=40){
            this.salario=horas*16;
        }else{
            this.salario=(40*16)+((horas-40)*20);
        }
        return this.salario;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de horas trabajadas: ");
        int horas = sc.nextInt();
        sc.nextLine();
        sc.close();
        SwitchExample example = new SwitchExample(horas);
        example.calcularSalario();
        System.out.println("Horas trabajadas: " + example.horasTrabajadas);
        System.out.println("Salario recibido: " + example.salario);

    }
}