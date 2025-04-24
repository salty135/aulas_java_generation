package aula_03;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o 1º número: ");
	        double numero1 = scanner.nextDouble();
	        
	        System.out.print("Digite o 2º número: ");
	        double numero2 = scanner.nextDouble();
	        
	        System.out.print("Operação (1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão): ");
	        int operacao = scanner.nextInt();
	        
	        double resultado = 0;
	        String simboloOperacao = "";
	        boolean operacaoValida = true;
	        
	        switch (operacao) {
	            case 1:
	                resultado = numero1 + numero2;
	                simboloOperacao = "+";
	                break;
	            case 2:
	                resultado = numero1 - numero2;
	                simboloOperacao = "-";
	                break;
	            case 3:
	                resultado = numero1 * numero2;
	                simboloOperacao = "*";
	                break;
	            case 4:
	                if (numero2 != 0) {
	                    resultado = numero1 / numero2;
	                    simboloOperacao = "/";
	                } else {
	                    System.out.println("Erro: Divisão por zero!");
	                    operacaoValida = false;
	                }
	                break;
	            default:
	                System.out.println("Operação Inválida");
	                operacaoValida = false;
	        }
	        
	        // Exibir o resultado se a operação foi válida
	        if (operacaoValida) {
	            System.out.printf("%.1f %s %.1f = %.1f\n", numero1, simboloOperacao, numero2, resultado);
	        }
	        
	        scanner.close();

	}

}
