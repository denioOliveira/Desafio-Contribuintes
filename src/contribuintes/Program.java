package contribuintes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import taxImposto.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos contribuintes você vai digitar? ");
		int N = sc.nextInt();
		System.out.println();
		
		List<TaxPayer> list = new ArrayList<>();
		
		for (int i=0; i<N; i++) {
			System.out.println("Digite os dados do "+(i+1)+"o contribuintes: ");
			System.out.print("Renda anual com salário: ");
			Double salario = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			Double prestServico = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			Double gCapital = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			Double gastMedico = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			Double gEducacao = sc.nextDouble();
			
			TaxPayer tax = new TaxPayer(salario,prestServico,gCapital,gastMedico,gEducacao);
			list.add(tax);
		}
		int i = 1;
		for (TaxPayer tax : list) {
			System.out.printf("\nResumo do %dº. contribuinte:\n", i++);
			System.out.printf("Imposto bruto total: %.2f%n", tax.grossTax());
			System.out.printf("Imposto bruto total: %.2f%n", tax.taxRebate());
			System.out.printf("Imposto bruto total: %.2f%n", tax.netTax());
			
		}
		
		sc.close();

	}

}
