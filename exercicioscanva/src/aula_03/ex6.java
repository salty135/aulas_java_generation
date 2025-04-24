package aula_03;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Solicitar e ler os dados do colaborador
        System.out.print("Nome do colaborador: ");
        String nome = scanner.nextLine();
        
        System.out.print("Cargo: ");
        int cargo = scanner.nextInt();
        
        System.out.print("Salário: R$ ");
        float salario = scanner.nextFloat();
        
        String nomeCargo = "";
        float percentualReajuste = 0;
        float novoSalario = 0;
        
   
        switch (cargo) {
            case 1:
                nomeCargo = "Gerente";
                percentualReajuste = 0.10f;
                break;
            case 2:
                nomeCargo = "Vendedor";
                percentualReajuste = 0.07f;
                break;
            case 3:
                nomeCargo = "Supervisor";
                percentualReajuste = 0.08f;
                break;
            case 4:
                nomeCargo = "Motorista";
                percentualReajuste = 0.06f;
                break;
            case 5:
                nomeCargo = "Estoquista";
                percentualReajuste = 0.05f;
                break;
            case 6:
                nomeCargo = "Técnico de TI";
                percentualReajuste = 0.08f;
                break;
            default:
                System.out.println("Código de cargo inválido!");
                return;
        }
        
        // Calcular o novo salário
        novoSalario = salario + (percentualReajuste * salario);
        
        // Exibir os resultados
        System.out.println("\nNome do colaborador: " + nome);
        System.out.println("Cargo: " + nomeCargo);
        System.out.printf("Salário: R$ %.2f\n", novoSalario);
        
        scanner.close();
	}

}
