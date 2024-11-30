package application;

import java.util.Locale;
import java.util.Scanner;

public class Storage {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		// define o tamanho do array
		int lengthArray = sc.nextInt();

		String[] nameIten = new String[lengthArray];
		double[] valueItens = new double[lengthArray];

		for (int i = 0; i < lengthArray; i++) {
			System.out.print("Digite o nome do item: ");
			nameIten[i] = sc.next();
			System.out.print("Digite o valor do item: ");
			valueItens[i] = sc.nextDouble();
		}

		double sumOfValues = 0;

		for (int i = 0; i < lengthArray; i++) {
			sumOfValues += valueItens[i];
		}

		double valuesMedia = sumOfValues / lengthArray;

		System.out.println("\nItens digitados:");
		for (int i = 0; i < lengthArray; i++) {
			System.out.println("Nome: " + nameIten[i] + ", Valor: " + valueItens[i]);
		}

		System.out.printf("\nA media dos valores é: %.2f%n ", valuesMedia);

		sc.close();

	}

}
