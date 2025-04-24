package aula_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        ArrayList<String> cores = new ArrayList<>();
	        
	        System.out.println("Digite 5 cores separadas por espaço:");
	        String input = scanner.nextLine();

	        String[] coresDigitadas = input.split(" ");
	        
	        for (int i = 0; i < Math.min(5, coresDigitadas.length); i++) {
	            cores.add(coresDigitadas[i]);
	        }

	        System.out.println("\nListar todas as cores:");
	        for (String cor : cores) {
	            System.out.print(cor + " ");
	        }

	        Collections.sort(cores);
	        System.out.println("\n\nOrdenar as cores:");
	        for (String cor : cores) {
	            System.out.print(cor + " ");
	        }
	        
	        scanner.close();
	}

}
