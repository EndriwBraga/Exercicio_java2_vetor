package application;

import java.util.Locale;
import java.util.Scanner;

public class Storage {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos itens deseja registrar? ");
		int lengthArray = sc.nextInt();
		sc.nextLine(); // Consumir a linha em branco '' BUFFER ''

		String[] itemNames = new String[lengthArray];
		double[] valueItens = new double[lengthArray];

		for (int i = 0; i < lengthArray; i++) {
			System.out.print("Digite o nome do item: ");
			itemNames[i] = sc.nextLine();

			System.out.print("Digite o valor do item: ");
			valueItens[i] = sc.nextDouble();
			sc.nextLine(); // Consumir a linha em branco '' BUFFER ''
		}

		double sumOfValues = 0;

		for (int i = 0; i < lengthArray; i++) {
			sumOfValues += valueItens[i];
		}

		double valuesMedia = sumOfValues / lengthArray;

		System.out.println("\nItens digitados:");
		for (int i = 0; i < lengthArray; i++) {
			System.out.println("Nome: " + itemNames[i] + ", Valor: " + valueItens[i]);
		}

		System.out.printf("\nA media dos valores é: %.2f%n ", valuesMedia);

		sc.close();

		// Há necessidade de quando o nome digitado for um numero pelo usuario, eu
		// converter p string p imprimir?
		// hoje não, mas no futuro? ....
	}
}
