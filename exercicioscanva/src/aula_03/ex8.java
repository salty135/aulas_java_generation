package aula_03;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        float saldo = 1000.00f; 
        
        System.out.print("Operação (1-Saldo, 2-Saque, 3-Depósito): ");
        int operacao = scanner.nextInt();
        
        float valor = 0;
        boolean operacaoValida = true;
        
        switch (operacao) {
            case 1:
                System.out.println("Operação - Saldo");
                break;
            case 2:
                System.out.print("Valor: R$ ");
                valor = scanner.nextFloat();
                System.out.println("Operação - Saque");
                if (valor > saldo) {
                    System.out.println("Saldo Insuficiente!");
                    operacaoValida = false;
                } else {
                    saldo -= valor;
                }
                break;
            case 3:
                System.out.print("Valor: R$ ");
                valor = scanner.nextFloat();
                System.out.println("Operação - Depósito");
                saldo += valor;
                break;
            default:
                System.out.println("Operação Inválida!");
                operacaoValida = false;
        }
        
        // Exibir o saldo se a operação foi válida
        if (operacaoValida) {
            System.out.printf("Saldo: R$ %.2f\n", saldo);
        }
        
        scanner.close();

	}

}
