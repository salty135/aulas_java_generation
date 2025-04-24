package aula_05;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int soma = 0;
        
        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }

        double media = (double) soma / vetor.length;

        System.out.print("\nElementos nos índices ímpares: ");
        for (int i = 1; i < vetor.length; i += 2) {
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\nElementos pares: ");
        for (int num : vetor) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nSoma: " + soma);
        System.out.printf("Média: %.2f", media);
        
        scanner.close();

	}

}
