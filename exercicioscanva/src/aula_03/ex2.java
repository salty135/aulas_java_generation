package aula_03;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     
	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();
    
	        String parOuImpar = (numero % 2 == 0) ? "par" : "ímpar";
	        
	        String positivoOuNegativo;
	        if (numero > 0) {
	            positivoOuNegativo = "positivo";
	        } else if (numero < 0) {
	            positivoOuNegativo = "negativo";
	        } else {
	            positivoOuNegativo = "zero (neutro)"; // Caso o número seja 0
	        }
	        
	        System.out.printf("O Número %d é %s e %s!\n", numero, parOuImpar, positivoOuNegativo);
	        
	        scanner.close();
	}

}
