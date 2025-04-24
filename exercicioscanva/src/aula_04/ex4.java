package aula_04;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        int backend = 0;
	        int mulheresFrontend = 0;
	        int homensMobileMaiores40 = 0;
	        int naoBinariosFullStackMenores30 = 0;
	        int totalPessoas = 0;
	        int somaIdades = 0;
	        
	        char continuar = 'S';
	        
	        System.out.println("Pesquisa de Colaboradores da Área de Desenvolvimento");
	        
	        while (continuar == 'S' || continuar == 's') {

	            System.out.print("\nDigite a idade: ");
	            int idade = scanner.nextInt();
	            
	            System.out.println("Identidade de Gênero:");
	            System.out.println("1 – Mulher Cis");
	            System.out.println("2 – Homem Cis");
	            System.out.println("3 – Não Binário");
	            System.out.println("4 – Mulher Trans");
	            System.out.println("5 – Homem Trans");
	            System.out.println("6 – Outros");
	            System.out.print("Opção: ");
	            int genero = scanner.nextInt();
	            
	            System.out.println("Área de Desenvolvimento:");
	            System.out.println("1 – Backend");
	            System.out.println("2 – Frontend");
	            System.out.println("3 – Mobile");
	            System.out.println("4 – FullStack");
	            System.out.print("Opção: ");
	            int area = scanner.nextInt();
	            
	            if (area == 1) backend++;
	            
	            if (area == 2 && (genero == 1 || genero == 4)) mulheresFrontend++;
	            
	            if (area == 3 && (genero == 2 || genero == 5) && idade > 40) homensMobileMaiores40++;
	            
	            if (area == 4 && genero == 3 && idade < 30) naoBinariosFullStackMenores30++;
	            
	            totalPessoas++;
	            somaIdades += idade;

	            System.out.print("\nDeseja cadastrar outro colaborador? (S/N): ");
	            continuar = scanner.next().charAt(0);
	        }

	        double mediaIdade = totalPessoas > 0 ? (double) somaIdades / totalPessoas : 0;

	        System.out.println("\nResultados da Pesquisa:");
	        System.out.println("Total de pessoas desenvolvedoras Backend: " + backend);
	        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresFrontend);
	        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensMobileMaiores40);
	        System.out.println("Total de Não Binários desenvolvedores FullStack menores de 30 anos: " + naoBinariosFullStackMenores30);
	        System.out.println("Total de pessoas que responderam à pesquisa: " + totalPessoas);
	        System.out.printf("Média de idade das pessoas que responderam à pesquisa: %.1f anos\n", mediaIdade);
	        
	        scanner.close();

	}

}
