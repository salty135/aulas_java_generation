package aula_03;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as três características do primeiro animal
        String caracteristica1 = scanner.nextLine().toLowerCase();
        String caracteristica2 = scanner.nextLine().toLowerCase();
        String caracteristica3 = scanner.nextLine().toLowerCase();
        
        // Identificar o primeiro animal
        String animal1 = identificarAnimal(caracteristica1, caracteristica2, caracteristica3);
        
        // Ler as três características do segundo animal
        caracteristica1 = scanner.nextLine().toLowerCase();
        caracteristica2 = scanner.nextLine().toLowerCase();
        caracteristica3 = scanner.nextLine().toLowerCase();
        
        // Identificar o segundo animal
        String animal2 = identificarAnimal(caracteristica1, caracteristica2, caracteristica3);
        
        // Exibir os resultados
        System.out.println(animal1);
        System.out.println(animal2);
        
        scanner.close();
    }
    
    public static String identificarAnimal(String c1, String c2, String c3) {
        if (c1.equals("vertebrado")) {
            if (c2.equals("ave")) {
                if (c3.equals("carnivoro")) {
                    return "Águia";
                } else if (c3.equals("onivoro")) {
                    return "Pomba";
                }
            } else if (c2.equals("mamifero")) {
                if (c3.equals("onivoro")) {
                    return "Homem";
                } else if (c3.equals("herbivoro")) {
                    return "Vaca";
                }
            }
        } else if (c1.equals("invertebrado")) {
            if (c2.equals("inseto")) {
                if (c3.equals("hematofago")) {
                    return "Pulga";
                } else if (c3.equals("herbivoro")) {
                    return "Lagarta";
                }
            } else if (c2.equals("anelideo")) {
                if (c3.equals("hematofago")) {
                    return "Sanguessuga";
                } else if (c3.equals("onivoro")) {
                    return "Minhoca";
                }
            }
        }
        return "Animal não identificado";
    }
}