
public class Angajat extends Persoana implements Print {
	int salariu;
	
	Angajat(String nume, String prenume, int inaltimea, int varsta, int salariu)
	{
		super(nume, prenume, inaltimea, varsta);
		this.salariu = salariu;
	}
	
	@Override
	public void print() {
		System.out.println("Sunt un angajat!");

	}

}
