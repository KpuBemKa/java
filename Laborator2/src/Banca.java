import java.util.ArrayList;

public class Banca {
    protected String codBanca;
    protected ArrayList<Client> clients;

    Banca(String codBanca, ArrayList<Client> clients)
    {
        this.codBanca = codBanca;
        this.clients = clients;
    }
}
