package aula_04;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        int menores21 = 0;
	        int maiores50 = 0;
	        int idade;
	        
	        System.out.println("Digite as idades (negativo para encerrar):");
	        
	        while (true) {
	            System.out.print("Digite uma idade: ");
	            idade = scanner.nextInt();

	            if (idade < 0) {
	                break;
	            }

	            if (idade < 21) {
	                menores21++;
	            } else if (idade > 50) {
	                maiores50++;
	            }
	        }

	        System.out.println("\n**Total de pessoas menores de 21 anos: " + menores21 + "**");
	        System.out.println("**Total de pessoas maiores de 50 anos: " + maiores50 + "**");
	        
	        scanner.close();
	}

}
