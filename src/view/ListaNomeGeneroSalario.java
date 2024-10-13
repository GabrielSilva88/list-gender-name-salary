package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNomeGeneroSalario {

	/*
	 * 14) Faça um algoritmo que leia o nome, o gênero e o salário de 5 funcionários e guarde esses dados em três listas. 
	 * No final, mostre uma listagem contendo apenas os dados das funcionárias mulheres que ganham mais de R$5 mil.
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<String> nomes = new ArrayList<String>();
		List<String> generos = new ArrayList<String>();
		List<Double> salarios = new ArrayList<Double>();

		for (int i = 0; i < 5; i++) {

			System.out.println("Funcionario " +(i+1)+"\nDigite o nome:");
			nomes.add(scan.nextLine());

			System.out.println("Funcionario " +(i+1)+"\nDigite o genero(F ou M): ");
			generos.add(scan.nextLine());

			System.out.println("Funcionario " +(i+1)+"\nDigite o salario: ");
			salarios.add(scan.nextDouble());
			scan.nextLine();
		}

		System.out.println("Nomes: " + nomes);
		System.out.println("Gênero: " + generos);
		System.out.println("Salário: " + salarios);

		// dados das funcionárias mulheres que ganham mais de R$5 mil.

		for (int i = 0; i < generos.size(); i++) {
			if (generos.get(i).equalsIgnoreCase("F") && salarios.get(i) > 5000) {
				System.out.println("Nome: " + nomes.get(i) + "\nSalário: " + salarios.get(i) + "\nGenero: " + generos.get(i));
			}
		}
		
	}

}
