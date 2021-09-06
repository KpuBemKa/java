import java.util.*;

public class Main {

	static void showContents(ArrayList<Persoana> persoane)
	{
		for(Persoana p : persoane)
		{
			p.showData();
		}
	}

	public static void main(String[] args) {
		ArrayList<Persoana> persoane = new ArrayList<>();
		persoane.add(new Persoana("Petrovich", "Victor", 180, 21));
		persoane.add(new Persoana("Grinevich", "Alexandr", 168, 22));
		persoane.add(new Persoana("Petrovich", "Dmitri", 197, 20));
		persoane.add(new Student("Murea", "Victor", 173, 19, 2021, 4));
		persoane.add(new Student("Minascurta", "Vitalie", 169, 19, 2021, 4));
		persoane.add(new Angajat("Semkov", "Artiom", 178, 22, 13000));

		System.out.println("\nPersoanele:");
		showContents(persoane);

		System.out.println("\nPersoanele sortate dupa varsta:");
		persoane.sort(Comparator.comparing(Persoana::getVarsta));
		showContents(persoane);

		System.out.println("\nPersoanele sortate dupa nume:");
		persoane.sort(Comparator.comparing(Persoana::getNume).thenComparing(Persoana::getPrenume));
		showContents(persoane);

		System.out.println("\nLista de studenti:");
		for(Persoana p : persoane)
		{
			if(p.getClass() == Student.class)
			{
				p.showData();
			}
		}
	}

}
