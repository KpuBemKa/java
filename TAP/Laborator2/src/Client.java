import java.util.*;

public class Client {
    protected String nume;
    protected String adresa;
    protected ArrayList<Cont> conts;

    Client() {
    }

    Client(String nume, String adresa, ArrayList<Cont> conts) {
        this.nume = nume;
        this.adresa = adresa;
        this.conts = conts;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public ArrayList<Cont> getConts() {
        return conts;
    }

    public void setConts(ArrayList<Cont> conts) {
        this.conts = conts;
    }

    public void getClientContsInfo()
    {
        System.out.println("-=============-\nNumele: " + this.nume + "  |  Adresa: " + this.adresa + "\nConturile:");

        for(Cont cont : conts)
        {
            System.out.println("Numarul contului: " + cont.numarCont + "  |  Suma pe cont: " + cont.suma + " " + cont.valuta + "  |  Dobanda zilnica: " + cont.getDobanda() + "  |  Suma totala: " + cont.getSumaTotala() + " " + cont.valuta);
        }
    }

    public Cont getContByNumber(String number)
    {
        for(Cont cont : conts)
        {
            if(cont.numarCont.equals(number))
            {
                return cont;
            }
        }

        return null;
    }
}
