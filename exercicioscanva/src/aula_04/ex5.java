package aula_04;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        int soma = 0;
	        int numero;
	        
	        System.out.println("Digite números inteiros (0 para encerrar):");

	        do {
	            System.out.print("Digite um número: ");
	            numero = scanner.nextInt();

	            if (numero > 0) {
	                soma += numero;
	            }
	        } while (numero != 0);

	        System.out.println("\nA soma dos números positivos é: " + soma);
	        
	        scanner.close();
	}

}
