import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		VolverPasado Vp = new VolverPasado();
		ExCompañeros Ex = new ExCompañeros();
		Golosinas Gl = new Golosinas();
		JuegosInfancia Ji = new JuegosInfancia();
		do {
			System.out.println("\n\n ---------------------- ");
			System.out.println("Menú - Volver al pasado");
			System.out.println("1) Listar Marcas");
			System.out.println("2) Listar Ex-Compañeros");
			System.out.println("3) Listar Precios");
			System.out.println("4) Listar Juegos Infancia");
			System.out.println("5) Salir");
			System.out.println("Ingrese una opción: ");
			int opcion = sc.nextInt();
			if (opcion == 1) {
				Vp.volverPasado();
			} else if (opcion == 2) {
				Ex.exCompañeros();
			} else if (opcion == 3) {
				Gl.golosinas();
			} else if (opcion == 4) {
				Ji.juegosInfancia();
			} else if (opcion == 5) {
				System.out.println("Abandonando el sistema de volver al pasado...");
				System.out.println("Acaba de salir del sistema");
				System.exit(0);
			}
		} while (i <= 5);
	}

}
