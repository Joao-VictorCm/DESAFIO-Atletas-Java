package Relatorio_Atetas;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int qtdAtletas = sc.nextInt();

		String nomeMaior = "";
		int maiorNumero = Integer.MIN_VALUE;

		String name;
		char sexo;
		int altura;
		int mulheres = 0;
		int homens = 0;
		int pesoTotal = 0;
		int peso;
		double somaAlturas = 0;
		int qtdMulhersComAltura = 0;

		for (int i = 0; i < qtdAtletas; i++) {
			System.out.printf("Digite os dados do atleta numero: %d%n", i + 1);

			// Nome
			System.out.print("Nome: ");
			name = sc.next();

			// Sexo
			System.out.print("Sexo (M/F): ");
			sexo = sc.next().charAt(0);
			while (sexo != 'M' && sexo != 'F') {
				System.out.print("Valor inválido! Digite F ou M: ");
				sexo = sc.next().charAt(0);
			}

			if (sexo == 'M') {
				homens++;
			} else {
				mulheres++;
			}

			// Peso
			System.out.print("Peso: ");
			peso = sc.nextInt();
			while (peso <= 0) {
				System.out.print("Valor inválido! Favor digitar um valor positivo: ");
				peso = sc.nextInt();
			}
			pesoTotal += peso;

			// Altura
			System.out.print("Altura: ");
			altura = sc.nextInt();
			while (altura <= 0) {
				System.out.print("Valor inválido! Favor digitar um valor positivo: ");
				altura = sc.nextInt();
			}

			if (altura > maiorNumero) {
				maiorNumero = altura;
				nomeMaior = name;
			}

			if (sexo == 'F') {
				somaAlturas += altura;
				qtdMulhersComAltura++;
			}
		}

		int totalAtletas = homens + mulheres;

		// Correção do cálculo do peso médio
		double pesoMedio = (double) pesoTotal / totalAtletas;

		double porcentHomens = ((double) homens / totalAtletas) * 100;

		System.out.println("\nRELATÓRIO:");
		System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio);
		System.out.println("Atleta mais alto: " + nomeMaior);
		System.out.printf("Porcentagem de homens: %.1f%%%n", porcentHomens);

		if (qtdMulhersComAltura > 0) {
			double mediaAlturaMulheres = somaAlturas / qtdMulhersComAltura;
			System.out.printf("Altura média das mulheres: %.2f%n", mediaAlturaMulheres);
		} else {
			System.out.println("Não há mulheres cadastradas.");
		}

		sc.close();

	}

}
