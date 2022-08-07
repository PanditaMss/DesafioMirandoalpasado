import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class VolverPasado {

	public static void volverPasado() {
		ArrayList<String> marcas = new ArrayList<String>();
		
		marcas.add("Toyota");
		marcas.add("Nissan");
		marcas.add("Samsung");
		marcas.add("Apple");
		marcas.add("Huawei");
		marcas.add("Chevrolet");
		marcas.add("SonicMaster");
		marcas.add("Monster");
		marcas.add("Playstation");
		marcas.add("Kalos");
		
		System.out.println("Mostrando marcas: ");
		System.out.println(marcas);
		
		marcas.add("Blockbaster");
		marcas.add("Carrefour");
		marcas.add("Jetix");
		
		System.out.println(marcas);
		marcas.set(10,"Blockbuster");
		System.out.println(marcas);
		marcas.remove(11);
		System.out.println(marcas);
		
		marcas.addAll(marcasFuera());
		System.out.println(marcas);
		System.out.println("La cantidad de elementos que hay en el listado son: " + marcas.size());
	}
	
	public static ArrayList<String> marcasFuera() {
		ArrayList<String> posiblesMarcas = new ArrayList<String>();
		posiblesMarcas.add("Fensa");
		posiblesMarcas.add("Lamborghini");
		posiblesMarcas.add("Rosen");
		posiblesMarcas.add("Wom");
		posiblesMarcas.add("Claro");
		posiblesMarcas.add("Movistar");
		return posiblesMarcas;
	}

}
