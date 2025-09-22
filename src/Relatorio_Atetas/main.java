package Relatorio_Atetas;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int qtdAtletas = sc.nextInt();

		String name;
		char sexo;
		int pesoMedio, porcentHomens, peso, altura;
		int homens = 0;
		int mulheres = 0;
		int altMedMulheres = 0;
		int somaAltF = 0;
		int result = 0;

		for (int i = 0; i < qtdAtletas; i++) {
			System.out.printf("Digite os dados do atleta numero %d%n", i + 1);
			System.out.println("name");
			name = sc.next();

			// Sexo
			System.out.println("sexo");
			sexo = sc.next().charAt(0);

			if (sexo != 'M') {
				mulheres++;
				altMedMulheres++;
				System.out.println("Altura");
				altura = sc.nextInt();
				if (altura < 0) {
					System.out.println("Valor invalido");
					altura = sc.nextInt();
				} else {
					somaAltF = (altura + altura);
			
				}

			} else {
				homens++;
			}

			// peso
			

		}
		
		result = somaAltF / mulheres;

		System.out.println(result);

		sc.close();

	}

}
