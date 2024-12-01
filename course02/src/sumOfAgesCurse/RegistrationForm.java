package sumOfAgesCurse;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class RegistrationForm {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas deseja registrar? ");
		int lengthArray = sc.nextInt();
		sc.nextLine(); // Consumir a linha em branco '' BUFFER ''

		ArrayList<PeopleRegistry> peopleList = new ArrayList<>();

		for (int i = 0; i < lengthArray; i++) {
			System.out.print("Digite o nome da pessoa: ");
			String name = sc.nextLine();

			System.out.print("Digite a idade da pessoa: ");
			int age = sc.nextInt();
			sc.nextLine(); // Consumir a linha em branco

			peopleList.add(new PeopleRegistry(name, age));
		}

		// Aqui, pegamos a idade de cada pessoa
		int sumOfAges = 0;
		for (PeopleRegistry person : peopleList) {
			sumOfAges += person.getAge();
		}

		int countAbove16 = 0;
		int totalPeople = peopleList.size();

		for (PeopleRegistry person : peopleList) {
			if (person.getAge() > 16) {
				countAbove16++;
			}
		}

		double percentage = (countAbove16 / (double) totalPeople) * 100;

		System.out.printf("Porcentagem de pessoas com idade acima de 16: %.2f%%\n", percentage);

		System.out.println("\nPessoas registradas:");
		for (PeopleRegistry person : peopleList) {
			System.out.println(person);
		}

		System.out.println("Soma das Idades: " + sumOfAges);

		sc.close();
	}
}