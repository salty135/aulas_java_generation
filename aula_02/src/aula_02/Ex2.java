package aula_02;

import java.util.Scanner;

public class Ex2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Declaração das variáveis do tipo float
	        float nota1, nota2, nota3, nota4, media;
	        
	        // Entrada das 4 notas
	        System.out.print("Nota 1: ");
	        nota1 = scanner.nextFloat();
	        
	        System.out.print("Nota 2: ");
	        nota2 = scanner.nextFloat();
	        
	        System.out.print("Nota 3: ");
	        nota3 = scanner.nextFloat();
	        
	        System.out.print("Nota 4: ");
	        nota4 = scanner.nextFloat();
	        
	        // Cálculo da média
	        media = (nota1 + nota2 + nota3 + nota4) / 4;
	        
	        // Saída do resultado formatado com 1 casa decimal
	        System.out.printf("\nMédia final: %.1f", media);
	        
	        scanner.close();
	    }
}
