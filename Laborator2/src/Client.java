import java.util.*;

public class Client {
    protected String nume;
    protected String adresa;
    protected ArrayList<Cont> conts;

    Client(){
    }

    Client(String nume, String adresa, ArrayList<Cont> conts)
    {
        this.nume = nume;
        this.adresa = nume;
        this.conts.addAll(conts);
    }
}
