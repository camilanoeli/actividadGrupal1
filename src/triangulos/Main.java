package triangulos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int ladoA = 0;
		int ladoB = 0;
		int ladoC = 0;
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el lado A: ");
		try {
			ladoA = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("El numero ingresado debe ser un entero!\nCerrando.");
			System.exit(1);
		}
		
		System.out.print("Ingrese el lado B:");
		try {
			ladoB = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("El numero ingresado debe ser un entero!\nCerrando.");
			System.exit(1);
		}
		
		System.out.print("Ingrese el lado C:");
		try {
			ladoC = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("El numero ingresado debe ser un entero!\nCerrando.");
			System.exit(1);
		}
		
		Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);
		System.out.println(triangulo.clasificar());
		
		scanner.close();
	}
}
