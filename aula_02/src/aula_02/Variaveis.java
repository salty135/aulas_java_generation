package aula_02;

import java.util.Scanner;
public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		//Defini;'ao das variáveis
		System.out.println("Digíte o primeiro número inteiro :");
		int numero_01 = leia.nextInt();
		
		System.out.println("Digíte o segundo  número inteiro :");
		int numero_02 = leia.nextInt();
		
		char opcao = 'V';
		boolean menorIdade = false;
		boolean maiorIdade = true;
		
		System.out.println("Digíte o seu nome:");
		String nome = leia.next();
		
	
		
		//Definição da constate PI
		final double PI = 3.1415;
		
		//Atribuição de valor 
		
		//exibição em tela
		System.out.printf("Variavel numero 1 é igual a: %d\n", numero_01); 
		System.out.println("Variavel numero 1 é igual a: " + numero_02);
		System.out.printf("Constante PI é igual a : %.2f\n", PI);
		System.out.println("Variavel nome em letras maiusculas: " + nome.toUpperCase());
		
	}

}
