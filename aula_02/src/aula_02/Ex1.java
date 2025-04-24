package aula_02;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaração das variáveis do tipo float
        float salario, abono, novoSalario;
        
        // Entrada de dados
        System.out.print("Digite o Salário: ");
        salario = scanner.nextFloat();
        
        System.out.print("Digite o Abono: ");
        abono = scanner.nextFloat();
        
        // Cálculo do novo salário
        novoSalario = salario + abono;
        
        // Saída do resultado
        System.out.println("\nNovo Salário: " + novoSalario);
        
        scanner.close();
    }

}
