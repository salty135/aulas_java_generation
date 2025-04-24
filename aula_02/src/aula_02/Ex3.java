package aula_02;

import java.util.Scanner;

public class Ex3 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Declaração das variáveis do tipo float
	        float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
	        
	        // Entrada de dados
	        System.out.print("Salário Bruto: ");
	        salarioBruto = scanner.nextFloat();
	        
	        System.out.print("Adicional Noturno: ");
	        adicionalNoturno = scanner.nextFloat();
	        
	        System.out.print("Horas Extras: ");
	        horasExtras = scanner.nextFloat();
	        
	        System.out.print("Descontos: ");
	        descontos = scanner.nextFloat();
	        
	        // Cálculo do salário líquido
	        salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
	        
	        // Saída do resultado formatado com 2 casas decimais
	        System.out.printf("\nSalário Líquido: %.2f", salarioLiquido);
	        
	        scanner.close();
	    }
}
