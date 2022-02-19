import java.util.ArrayList;

public class Banca implements BancaOperations {
    protected String codBanca;
    protected ArrayList<Client> clients;

    Banca() {
    }

    Banca(String codBanca, ArrayList<Client> clients) {
        this.codBanca = codBanca;
        this.clients = clients;
    }

    public String getCodBanca() {
        return codBanca;
    }

    public void setCodBanca(String codBanca) {
        this.codBanca = codBanca;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public Client getClientByName(String name)
    {
        for(Client client : clients)
        {
            if(client.nume.equals(name))
            {
                return client;
            }
        }

        return null;
    }

    @Override
    public void depunere(Cont destination, double suma) {
        for (Client client : clients) {
            for (int i = 0; i < client.conts.size(); i++) {
                if (client.conts.get(i).equals(destination)) {
                    client.conts.get(i).suma += suma;
                }
            }
        }
    }

    @Override
    public void extragere(Cont destination, double suma) {
        for (Client client : clients) {
            for (int i = 0; i < client.conts.size(); i++) {
                if (client.conts.get(i).equals(destination)) {
                    client.conts.get(i).suma -= suma;
                }
            }
        }
    }

    @Override
    public void transfer(Cont sender, Cont reciever, double suma) {
        extragere(sender, suma);
        depunere(reciever, suma);
    }
}
