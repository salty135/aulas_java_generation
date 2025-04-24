package aula_03;

import java.util.Scanner;

public class ex3 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o Nome do doador: ");
	        String nome = scanner.nextLine();
	        
	        System.out.print("Digite a Idade do doador: ");
	        int idade = scanner.nextInt();
	        
	        System.out.print("Primeira doação de sangue? (true/false): ");
	        boolean primeiraDoacao = scanner.nextBoolean();
	     
	        boolean apto = false;
	        
	        if (idade >= 18 && idade <= 69) {
	            if (idade >= 60 && idade <= 69) {
	                if (!primeiraDoacao) {
	                    apto = true; 
	                }
	            } else {
	                apto = true; 
	            }
	        }
	        
	        if (apto) {
	            System.out.println(nome + " está apto para doar sangue!");
	        } else {
	            System.out.println(nome + " não está apto para doar sangue!");
	        }
	        
	        scanner.close();
	    }
}
