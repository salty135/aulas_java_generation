package aula_05;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        final int PARTICIPANTES = 10;
        final int BIMESTRES = 4;
        double[][] notas = new double[PARTICIPANTES][BIMESTRES];
        double[] medias = new double[PARTICIPANTES];

        System.out.println("Digite as notas dos 10 participantes (4 bimestres cada):");

        // Ler as notas de cada participante
        for (int i = 0; i < PARTICIPANTES; i++) {
            System.out.println("\nParticipante " + (i + 1) + ":");
            for (int j = 0; j < BIMESTRES; j++) {
                System.out.print("Bimestre " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        // Calcular as médias
        for (int i = 0; i < PARTICIPANTES; i++) {
            double soma = 0;
            for (int j = 0; j < BIMESTRES; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / BIMESTRES;
        }

        // Exibir as médias
        System.out.println("\nMédias dos participantes:");
        for (int i = 0; i < PARTICIPANTES; i++) {
            System.out.printf("Participante %d: %.1f\n", (i + 1), medias[i]);
        }

        scanner.close();

	}

}
