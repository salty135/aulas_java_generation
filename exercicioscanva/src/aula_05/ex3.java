package aula_05;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("\nElementos da Diagonal Principal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
            somaDiagonalPrincipal += matriz[i][i];
        }

        System.out.print("\nElementos da Diagonal Secundária: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
            somaDiagonalSecundaria += matriz[i][2 - i];
        }

        System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal);
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria);

        scanner.close();


	}

}
