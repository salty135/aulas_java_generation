package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        ArrayList<Integer> numeros = new ArrayList<>();
	        numeros.add(2);
	        numeros.add(5);
	        numeros.add(1);
	        numeros.add(3);
	        numeros.add(4);
	        numeros.add(9);
	        numeros.add(7);
	        numeros.add(8);
	        numeros.add(10);
	        numeros.add(6);

	        System.out.println("Lista com índices:");
	        for (int i = 0; i < numeros.size(); i++) {
	            System.out.println(i + " → " + numeros.get(i));
	        }

	        System.out.print("\nDigite o número que você deseja encontrar: ");
	        int numeroProcurado = scanner.nextInt();

	        int posicao = -1;
	        for (int i = 0; i < numeros.size(); i++) {
	            if (numeros.get(i) == numeroProcurado) {
	                posicao = i;
	                break;
	            }
	        }

	        if (posicao != -1) {
	            System.out.println("O número " + numeroProcurado + " está localizado na posição: " + posicao);
	        } else {
	            System.out.println("O número " + numeroProcurado + " não foi encontrado!");
	        }
	        
	        scanner.close();
	}

}
