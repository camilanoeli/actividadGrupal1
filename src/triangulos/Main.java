package triangulos;

public class Main {
	public static void main(String[] args) {
		float a = 3, b = 3, c = 3;

		Triangulo t = new Triangulo(a, b, c);
		System.out.println(t.clasificar());

	}
}
