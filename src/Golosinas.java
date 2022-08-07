import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Golosinas {
	public static void golosinas() {

		TreeMap<Integer, String> golosinas = new TreeMap<Integer, String>();

		golosinas.put(100, "Chocman");
		golosinas.put(100, "Trululú");
		golosinas.put(100, "Centella");
		golosinas.put(50, "Kilate");
		golosinas.put(30, "Miti-miti");
		golosinas.put(150, "Traga Traga");
		golosinas.put(5, "Tabletón");

		Set set = golosinas.entrySet();
		Iterator iterator = set.iterator();

		System.out.println("Golosinas ordenadas:");
		while (iterator.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) iterator.next();
			System.out.println("Precio: " + mapEntry.getKey() + ", " + "Producto: " + mapEntry.getValue());
		}

		// Filtradas

		SortedMap<Integer, String> map_head = new TreeMap<Integer, String>();
		map_head = golosinas.headMap(100);
		set = map_head.entrySet();
		iterator = set.iterator();

		System.out.println("\nGolosinas filtradas: ");
		while (iterator.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) iterator.next();
			System.out.println("Precio: " + mapEntry.getKey() + ", " + "Producto: " + mapEntry.getValue());
		}
	}
}
