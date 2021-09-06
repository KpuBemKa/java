import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Persoana> persoane = new ArrayList<Persoana>();
		persoane.add(new Persoana("Petrovich", "Victor", 180, 21));
		persoane.add(new Persoana("Petrovich", "Alexandr", 168, 22));
		persoane.add(new Persoana("Petrovich", "Dmitri", 197, 20));

		for(Persoana p : persoane)
		{
			p.showData();
		}
	}

}
