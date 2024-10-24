package Lambda.Project;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        List<Product> Products = Arrays.asList(
            new Product("Laptop", "TECNOLOGÍA", 1200, 4.7),
            new Product("Smartphone", "TECNOLOGÍA", 800, 4.5),
            new Product("Tablet", "TECNOLOGÍA", 600, 4.3),
            new Product("Televisor", "ELECTRODOMÉSTIOS", 1500, 4.8),
            new Product("Refrigerador", "ELECTRODOMÉSTIOS", 1000, 4.1),
            new Product("Microondas", "ELECTRODOMÉSTIOS", 300, 3.9),
            new Product("Cámara", "TECNOLOGÍA", 700, 4.6)
        );
        boolean valid = true;
        while(valid){
            System.out.println("Le gustaría obsrvar los productos? SI/NO");
            String validation = sc.next().toUpperCase();
            switch (validation) {
                case "SI":
                    System.out.println("Ingrese qué tipo de producto le gustaría observar...");
                    System.out.print("Tecnología/Electrodomesticos: ");
                    String quest = sc.next();
                    quest=quest.toUpperCase();
                    switch(quest) {
                        case "TECNOLOGÍA":
                            List<Product> tecProducts = Products.stream().filter(p -> p.getCategory().equals("TECNOLOGÍA")).collect(Collectors.toList());
                            tecProducts.forEach(System.out::println);
                            break;
                        case "ELECTRODOMÉSTICOS":
                            List<Product> elcProducts = Products.stream().filter(p -> p.getCategory().equals("TECNOLOGÍA")).collect(Collectors.toList());
                            elcProducts.forEach(System.out::println);
                            break;
                    
                        default:
                            System.out.println("Ingrese un comando valido");
                            break;
                    }
                    break;

                case "NO":
                    System.out.println("Bye bye");
                    valid=false;
                    break;
            
                default:
                    System.out.println("Ingrese un comando valido.");
                    break;
            }
            
            

        }
        
        sc.close();
        
    }
}