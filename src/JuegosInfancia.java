import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class JuegosInfancia {
	public void juegosInfancia() {
		Queue<String> q = new LinkedList<>();

		q.add("Tombo");
		q.add("Congelado");
		q.add("Quemaditas");
		q.add("Cachipún");
		q.add("Pillarse");

		System.out.println("Listado de Juegos de infancia: " + q);
		

		int size = q.size();
		System.out.println("Tamaño del listado: " + size);
		
		Iterator iterator = q.iterator();
	    while(iterator.hasNext()){
	        String element = (String) iterator.next();
	        System.out.println("Juego:" + element);
	    }

	}

}
