package Lambda.Project;
import java.util.List;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main{
    private static void displayProducts(List<Product> products) {
        if (products.isEmpty()) {
            System.out.println("No se encontraron productos con esos criterios.");
        } else {
            products.forEach(System.out::println);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        List<Product> products = Arrays.asList(
        // Categoria TECNOLOGiA
        new Product("Laptop", "TECNOLOGiA", 1200, 4.7),
        new Product("Smartphone", "TECNOLOGiA", 800, 4.5),
        new Product("Tablet", "TECNOLOGiA", 600, 4.3),
        new Product("Camara", "TECNOLOGiA", 700, 4.6),
        new Product("Auriculares", "TECNOLOGiA", 150, 4.2),
        new Product("Impresora", "TECNOLOGiA", 250, 4.0),
        new Product("Monitor", "TECNOLOGiA", 300, 4.1),
        new Product("Teclado", "TECNOLOGiA", 80, 3.9),
        new Product("Reloj Inteligente", "TECNOLOGiA", 400, 4.4),
        new Product("Altavoces", "TECNOLOGiA", 200, 4.3),
        
        // Categoria ELECTRODOMeSTICOS
        new Product("Televisor", "ELECTRODOMeSTICOS", 1500, 4.8),
        new Product("Refrigerador", "ELECTRODOMeSTICOS", 1000, 4.1),
        new Product("Microondas", "ELECTRODOMeSTICOS", 300, 3.9),
        new Product("Lavadora", "ELECTRODOMeSTICOS", 600, 4.0),
        new Product("Secadora", "ELECTRODOMeSTICOS", 500, 4.3),
        new Product("Horno", "ELECTRODOMeSTICOS", 700, 4.5),
        new Product("Aspiradora", "ELECTRODOMeSTICOS", 250, 4.2),
        new Product("Licuadora", "ELECTRODOMeSTICOS", 100, 3.8),
        new Product("Plancha", "ELECTRODOMeSTICOS", 80, 3.7),
        new Product("Cafetera", "ELECTRODOMeSTICOS", 120, 4.1),
        
        // Categoria HOGAR
        new Product("Silla", "HOGAR", 50, 3.8),
        new Product("Mesa", "HOGAR", 150, 4.0),
        new Product("Lampara", "HOGAR", 40, 4.2),
        new Product("Cama", "HOGAR", 500, 4.3),
        new Product("Colchon", "HOGAR", 300, 4.4),
        new Product("Espejo", "HOGAR", 60, 3.9),
        new Product("Alfombra", "HOGAR", 100, 4.1),
        new Product("Cortinas", "HOGAR", 70, 4.0),
        new Product("Estanteria", "HOGAR", 200, 4.3),
        new Product("Perchero", "HOGAR", 35, 3.7),
        
        // Categoria DEPORTES
        new Product("Bicicleta", "DEPORTES", 400, 4.6),
        new Product("Cinta de correr", "DEPORTES", 1200, 4.7),
        new Product("Pesas", "DEPORTES", 100, 4.2),
        new Product("Colchoneta", "DEPORTES", 50, 3.9),
        new Product("Balon de futbol", "DEPORTES", 20, 4.5),
        new Product("Raqueta de tenis", "DEPORTES", 80, 4.3),
        new Product("Cuerda de saltar", "DEPORTES", 10, 4.1),
        new Product("Eliptica", "DEPORTES", 700, 4.5),
        new Product("Guantes de boxeo", "DEPORTES", 50, 4.0),
        new Product("Patineta", "DEPORTES", 100, 4.3),
        
        // Categoria LIBROS
        new Product("Libro A", "LIBROS", 15, 4.8),
        new Product("Libro B", "LIBROS", 20, 4.5),
        new Product("Libro C", "LIBROS", 25, 4.3),
        new Product("Libro D", "LIBROS", 18, 4.2),
        new Product("Libro E", "LIBROS", 22, 4.6),
        new Product("Libro F", "LIBROS", 30, 4.1),
        new Product("Libro G", "LIBROS", 12, 3.9),
        new Product("Libro H", "LIBROS", 28, 4.4),
        new Product("Libro I", "LIBROS", 35, 4.7),
        new Product("Libro J", "LIBROS", 17, 4.0),
        
        // Resto de productos de cada categoria para completar 100
        new Product("Smart TV", "TECNOLOGiA", 900, 4.5),
        new Product("iPad", "TECNOLOGiA", 850, 4.6),
        new Product("Consola de videojuegos", "TECNOLOGiA", 450, 4.7),
        new Product("Smartwatch", "TECNOLOGiA", 300, 4.4),
        new Product("e-Reader", "TECNOLOGiA", 120, 4.2),
        
        new Product("Lavavajillas", "ELECTRODOMeSTICOS", 700, 4.3),
        new Product("Freidora de aire", "ELECTRODOMeSTICOS", 150, 4.4),
        new Product("Ventilador", "ELECTRODOMeSTICOS", 80, 3.9),
        new Product("Calefactor", "ELECTRODOMeSTICOS", 90, 4.0),
        new Product("Deshumidificador", "ELECTRODOMeSTICOS", 200, 4.2),
        
        new Product("Sofa", "HOGAR", 600, 4.6),
        new Product("Escritorio", "HOGAR", 250, 4.3),
        new Product("Banco", "HOGAR", 80, 3.8),
        new Product("Taburete", "HOGAR", 25, 3.7),
        new Product("Armario", "HOGAR", 400, 4.5),
        
        new Product("Reloj para correr", "DEPORTES", 150, 4.6),
        new Product("Botella de agua", "DEPORTES", 15, 4.2),
        new Product("Proteina en polvo", "DEPORTES", 60, 4.3),
        new Product("Casco", "DEPORTES", 45, 4.1),
        new Product("Zapatillas deportivas", "DEPORTES", 120, 4.4),
        
        new Product("Diccionario", "LIBROS", 40, 4.5),
        new Product("Enciclopedia", "LIBROS", 50, 4.3),
        new Product("Novela grafica", "LIBROS", 25, 4.2),
        new Product("Libro de poesia", "LIBROS", 10, 3.9),
        new Product("Atlas mundial", "LIBROS", 35, 4.4),
        
        // Agregar mas para completar 100 productos
        new Product("Smartphone Premium", "TECNOLOGiA", 1000, 4.7),
        new Product("Sistema de altavoces", "TECNOLOGiA", 500, 4.6),
        new Product("Enfriador de vino", "ELECTRODOMeSTICOS", 300, 4.3),
        new Product("Tostadora", "ELECTRODOMeSTICOS", 60, 4.0),
        new Product("Mesa auxiliar", "HOGAR", 120, 4.2),
        new Product("Kit de yoga", "DEPORTES", 40, 4.4),
        new Product("Manual de jardineria", "LIBROS", 22, 4.1)
        );
        boolean valid=true;
        while(valid){
            sc.nextLine();
            System.out.println("¿Desea ingresar a la tienda?");
            String validation = sc.next().toUpperCase();
            switch (validation) {
                case "SI":
                    System.out.println("¿Como desea filtrar su busqueda?");
                    System.out.println("1. Todos");
                    System.out.println("2. Nombre");
                    System.out.println("3. Categoria");
                    System.out.println("4. Precio");
                    System.out.println("5. Puntuacion");
                    System.out.print("Ingrese el numero de la opcion -> ");
                    try {
                        int i = sc.nextInt();
                        sc.nextLine();
                        Product obj = new Product();
                        switch (i) {
                        case 1:
                            displayProducts(products);
                            break;
                        case 2:
                            List<String> names = products.stream().map(Product::getName).distinct().collect(Collectors.toList());
                            names.forEach(System.out::println);
                            System.out.print("¿Por que nombre los quiere filtrar? -> ");
                            String j = sc.nextLine().toUpperCase();
                            displayProducts(obj.filterByProduct(products, j, null, null, null));
                            break;
                        case 3:
                            List<String> categories = products.stream().map(Product::getCategory).distinct().collect(Collectors.toList());
                            categories.forEach(System.out::println);
                            System.out.print("¿Por que categoria los quiere filtrar? -> ");
                            String k = sc.nextLine().toUpperCase();
                            displayProducts(obj.filterByProduct(products, null , k, null, null));
                            break;
                        case 4:
                            System.out.print("¿Hasta que precio los quiere filtrar? ->$");
                            Double l = sc.nextDouble();
                            sc.nextLine();
                            displayProducts(obj.filterByProduct(products, null, null, l, null));
                            break;
                        case 5:
                            System.out.print("¿Desde que calificacion quiere ver los productos? -> ");
                            Double m = sc.nextDouble();
                            sc.nextLine();
                            displayProducts(obj.filterByProduct(products, null, null, null, m));
                            break;
                        default:
                            System.out.println("Ingrese una opcion correcta");
                            break;
                    }
                    } catch (InputMismatchException e) {
                    System.out.println("Ingrese una opcion valida, intente de nuevo!!");
                    }
                    break;
                case "NO":
                    System.out.println("Regrese luego...");
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