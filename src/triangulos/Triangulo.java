package triangulos;

public class Triangulo {

	double a;
	double b;
	double c;

	public Triangulo(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String clasificar() {
		String resultado = "";
		if (esEntero(a) && esEntero(b) && esEntero(c)) {
			if (a > 0 && b > 0 && c > 0) {
				if (esTriangulo()) {
					if (esEquilatero()) {
						resultado = "Es equilátero";
					} else if (esIsoceles()) {
						resultado = "Es isóceles";
					} else {
						resultado = "Es escaleno";
					}
				} else {
					resultado = "No es un triángulo";
				}
			} else {
				resultado = "Los valores ingresados deben ser números mayores a 0";
			}
		} else {
			resultado = "Los valores ingresados deben ser números enteros";
		}

		return resultado;
	}

	public boolean esEntero(double numero) {
		return numero % 1 == 0;
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
