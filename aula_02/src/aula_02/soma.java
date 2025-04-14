package aula_02;

public class soma {

	public static void main(String[] args) {
		
		int numero_01 = 2, numero_02 = 2;;
		String numeroS_01 = "2", numeroS_02 = "2";

		System.out.printf("%d + %d = %d", numero_01, numero_02,(numero_01 + numero_02));
		System.out.printf("\nConcatenação: %s + %s = %s", numero_01, numero_02,(numeroS_01 + numeroS_02));

		System.out.println(numero_01 = numero_02 + 2);
		System.out.println(numero_01 += 2);

	}

}
