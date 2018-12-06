package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuente;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Contribuente> lista = new ArrayList<>();

		System.out.print("Numero de contribuente:");
		int a = sc.nextInt();
		for (int b = 0; b < a; b++) {
			System.out.println("Contribuente " + (b + 1) + ":");
			System.out.print("Pessoa Fisica ou Juridica (f/j)?");
			char c = sc.next().charAt(0);
			if (c == 'f') {
				System.out.print("Nome:");
				String nome = sc.next();
				System.out.print("Renda anual:");
				Double rendaAnual = sc.nextDouble();
				System.out.print("Despesas com saúde:");
				Double despesasSaude = sc.nextDouble();

				lista.add(new PessoaFisica(nome, rendaAnual, despesasSaude));

			} else if (c =='j') {

				System.out.print("Nome:");
				String nome = sc.next();
				System.out.print("Renda anual:");
				Double rendaAnual = sc.nextDouble();
				System.out.print("Numero funcionarios:");
				Integer numeroFuncionarios = sc.nextInt();

				lista.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));

			} else {
				System.out.println("Entre com um valor correto.");
			}
		}

		
		System.out.println();
		System.out.println("Taxas:");
		System.out.println();
		double soma=0.0;
		for (Contribuente contribuente : lista) {
			double taxas=contribuente.despesas();
				System.out.println(contribuente.getNome()+" Despesas:$"+String.format("%.2f",taxas));
		soma+=taxas;
		}
		System.out.println("Total das Taxas:$"+String.format("%.2f",soma));
		sc.close();
	}

}
