package aula_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ex3 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Set<Integer> numeros = new HashSet<>();
	        
	        System.out.println("Digite 10 valores inteiros não repetidos:");

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o " + i + "º número: ");
	            int numero = scanner.nextInt();

	            if (!numeros.add(numero)) {
	                System.out.println("Número repetido! Digite outro valor.");
	                i--;
	            }
	        }

	        System.out.println("\nListar dados do Set:");
	        Iterator<Integer> iterator = numeros.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        scanner.close();

	}

}
