import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExCompañeros {

	public void exCompañeros() {
		// Creating and adding elements
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Daniel");
		set.add("Paola");
		set.add("Facundo");
		set.add("Pedro");
		set.add("Florencia");
		set.add("Jacinta");
		set.add("Juan Pablo");

		System.out.println("Mostrando ex-compañeros: ");
		System.out.println(set);

		set.addAll(posiblesInvitados());

		System.out.println(set);

		set.remove("Jorge");

		System.out.println(set);

	}

	public TreeSet<String> posiblesInvitados() {
		TreeSet<String> set = new TreeSet<String>();
		set.add("Jorge");
		set.add("Francisco");
		set.add("Marcos");
		return set;
	}

}
