package aula_02;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaração das variáveis do tipo float
        float n1, n2, n3, n4, diferenca;
        
        // Entrada dos quatro valores
        System.out.print("numero1: ");
        n1 = scanner.nextFloat();
        
        System.out.print("numero2: ");
        n2 = scanner.nextFloat();
        
        System.out.print("numero3: ");
        n3 = scanner.nextFloat();
        
        System.out.print("numero4: ");
        n4 = scanner.nextFloat();
        
        // Cálculo da diferença entre os produtos
        diferenca = (n1 * n2) - (n3 * n4);
        
        // Saída do resultado formatado
        System.out.printf("\nDiferença: %.1f", diferenca);
        
        scanner.close();
    }
}
