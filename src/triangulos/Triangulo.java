package triangulos;

public class Triangulo {
	int a;
	int b;
	int c;

	public Triangulo(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String clasificar() {
		String resultado = "";
		if (a > 0 && b > 0 && c > 0) {
			if (esTriangulo()) {
				if (esEquilatero()) {
					resultado = "Es equil�tero";
				} else if (esIsoceles()) {
					resultado = "Es is�celes";
				} else {
					resultado = "Es escaleno";
				}
			} else {
				resultado = "No es un tri�ngulo";
			}
		} else {
			resultado = "Los valores ingresados deben ser n�meros mayores a 0";
		}

		return resultado;
	}

	public boolean esTriangulo() {
		return a + b > c && a + c > b && b + c > a;
	}

	public boolean esEscaleno() {
		return a != b && a != c && b != c;
	}

	public boolean esEquilatero() {
		return a == b && a == c;
	}

	public boolean esIsoceles() {
		return a == b || a == c || b == c;
	}
}
