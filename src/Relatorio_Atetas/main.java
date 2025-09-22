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
		int qtdP = 0;

		for (int i = 0; i < qtdAtletas; i++) {
			System.out.printf("Digite os dados do atleta numero: %d%n", +i + 1);

			// nome
			System.out.print("Nome:");
			name = sc.next();

			// Sexo
			System.out.println("Sexo");
			sexo = sc.next().charAt(0);
			if (sexo == 'M' || sexo == 'F') {

				if (sexo != 'M') {
					// se for feminino
					mulheres++;

				} else {
					// se for Masculino
					homens++;
				}

				// peso
				System.out.println("peso");
				peso = sc.nextInt();
				if (peso < 0) {
					System.out.println("Valor invalido");
					System.out.println("peso");
					peso = sc.nextInt();
				}

				qtdP += peso;

				
				// altura
				System.out.println("Altura");
				altura = sc.nextInt();
				// verificar altura
				if (altura < 0) {
					System.out.println("Valor invalido");
					System.out.println("altura");
					peso = sc.nextInt();
				}
				
				if(altura > maiorNumero) {
					maiorNumero = altura;
					nomeMaior = name;
				}
				
				
				
				
				

				/// verificação do sexo
			} else {
				System.out.println("Valor invalido");
				System.out.println("F ou M");
				sexo = sc.next().charAt(0);
			}

		}

		
		int qtdF = mulheres;
		int qtdM = homens;
		int totalAteltas = qtdM +qtdF;
		
		System.out.println("aqui"+mulheres + homens + totalAteltas);
		double porcentHomens = (homens / totalAteltas) * 100;
		
		
		
		System.out.println(qtdP);
		System.out.println(nomeMaior);
		System.out.println(porcentHomens);
		sc.close();

	}

}
