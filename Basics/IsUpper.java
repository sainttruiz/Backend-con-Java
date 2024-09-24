package Basics;
import java.util.Scanner;
import java.util.ArrayList;
public class IsUpper{

    static ArrayList<Character> upperList = new ArrayList<>();

    public static void addToList(){
        for (char word='A'; word<='Z';word++){
            IsUpper.upperList.add(word);
        }
    }
    public static void main(String[] args) {
        IsUpper.addToList();
        System.out.println(IsUpper.upperList);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        char word = sc.next().charAt(0);
        if (IsUpper.upperList.contains(word)){
            System.out.println("La letra es mayúscula");
        }else{
            System.out.println("La letra no es mayúscula");
        }
        sc.close();
    }
}