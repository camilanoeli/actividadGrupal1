package triangulos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int ladoA = 0;
		int ladoB = 0;
		int ladoC = 0;
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el lado A (entero positivo): ");
		try {
			ladoA = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("El lado A debe ser un entero.");
			System.exit(1);
		}
		
		if (ladoA <= 0) {
			System.out.println("El lado A debe ser un numero entero positivo.");
			System.exit(1);
		}
		
		System.out.print("Ingrese el lado B (entero positivo):");
		try {
			ladoB = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("El lado B debe ser un entero.");
			System.exit(1);
		}
		
		if (ladoB <= 0) {
			System.out.println("El lado B debe ser un numero entero positivo.");
			System.exit(1);
		}
		
		System.out.print("Ingrese el lado C (entero positivo):");
		try {
			ladoC = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("El lado C debe ser un entero!.");
			System.exit(1);
		}

		
		if (ladoC <= 0) {
			System.out.println("El lado C debe ser un numero entero positivo.");
			System.exit(1);
		}
		
		Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);
		System.out.println(triangulo.clasificar());
		
		scanner.close();
	}
}
