
public class Persoana {
	protected String nume;
	protected String prenume;
	protected int inaltimea;
	protected int varsta;
	
	Persoana()
	{
	}
	
	Persoana(String nume, String prenume, int inaltimea, int varsta)
	{
		this.nume = nume;
		this.prenume = prenume;
		this.inaltimea = inaltimea;
		this.varsta = varsta;
	}
	
	void showData()
	{
		System.out.println("Numele: " + nume + "\nPrenumele: " + prenume + "\nInaltimea: " + inaltimea + "\nVarsta" + varsta);
	}
	
	void setNume(String nume)
	{
		this.nume = nume;
	}
	
	void setPrenume(String prenume)
	{
		this.prenume = prenume;
	}
	
	void setInaltimea(int inaltimea)
	{
		this.inaltimea = inaltimea;
	}
	
	void setVarsta(int varsta)
	{
		this.varsta = varsta;
	}
	
	String getNume()
	{
		return this.nume;
	}
	
	String Prenume()
	{
		return this.prenume;
	}
	
	int getInaltimea()
	{
		return this.inaltimea;
	}
	
	int getVarsta()
	{
		return this.inaltimea;
	}
}
