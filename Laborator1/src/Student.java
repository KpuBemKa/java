
public class Student extends Persoana implements Print {
	protected int anulDeStudii;
	protected static int numarAnDeStudii;
	
	Student()
	{}
	
	Student(String nume, String prenume, int inaltimea, int varsta, int anulDeStudii, int numarAnDeStudii)
	{
		super(nume, prenume, inaltimea, varsta);
		this.anulDeStudii = anulDeStudii;
		Student.numarAnDeStudii = numarAnDeStudii;
	}
	
	@Override
	public void print() {
		System.out.println("Sunt un student!");

	}

}
