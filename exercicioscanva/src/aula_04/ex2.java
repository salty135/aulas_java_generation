package aula_04;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int pares = 0;
	        int impares = 0;
	        
	        System.out.println("Digite 10 números inteiros:");
	        
	      
	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o " + i + "º número: ");
	            int numero = scanner.nextInt();
	            
	            if (numero % 2 == 0) {
	                pares++;
	            } else {
	                impares++;
	            }
	        }	        
	        
	        System.out.println("\n**Total de números pares:** " + pares);
	        System.out.println("**Total de números ímpares:** " + impares);
	        
	        scanner.close();
	}

}
