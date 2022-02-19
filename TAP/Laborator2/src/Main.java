import java.util.ArrayList;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        Banca banca = new Banca("1322", new ArrayList<Client>());

        banca.clients.add(new Client("Petrenco Vladimir", "Mun. Tighina, Str. Chisinau 3, MD-2357", new ArrayList<Cont>() {
            {
                add(new Cont("0", "MDL", 24531.5));
                add(new Cont("1", "EUR", 428.2));
            }
        }));

        banca.clients.add(new Client("Sokolova Diana", "Mun. Cricova, B-dul. Lenin 3A, MD-3698", new ArrayList<Cont>() {
            {
                add(new Cont("2", "EUR", 7565.7));
                add(new Cont("3", "MDL", 85351.1));
                add(new Cont("4", "MDL", 9897.3));
            }
        }));

        banca.clients.add(new Client("Ermakov Constantin", "Taraclia, Str-la Cireșilor 1/5, MD-4995", new ArrayList<Cont>() {
            {
                add(new Cont("5", "MDL", 14751.8));
            }
        }));

        System.out.println("Lista clientilor bancii:");
        for (Client client : banca.clients) {
            client.getClientContsInfo();
        }

        System.out.println("\nPe contul " + banca.getClientByName("Petrenco Vladimir").conts.get(0).numarCont + " s-au depus 200 " + banca.getClientByName("Petrenco Vladimir").getContByNumber("0").valuta);
        banca.depunere(banca.getClientByName("Petrenco Vladimir").getContByNumber("0"), 200);
        banca.getClientByName("Petrenco Vladimir").getClientContsInfo();

        System.out.println("\nDe pe contul " + banca.getClientByName("Ermakov Constantin").conts.get(0).numarCont + " s-au extras 372 " + banca.getClientByName("Ermakov Constantin").conts.get(0).valuta);
        banca.extragere(banca.getClientByName("Ermakov Constantin").conts.get(0), 372);
        banca.getClientByName("Ermakov Constantin").getClientContsInfo();

        System.out.println("\nDe pe contul " + banca.getClientByName("Sokolova Diana").conts.get(1).numarCont + " s-au transferat 5400 MDL pe cintul " + banca.getClientByName("Ermakov Constantin").conts.get(0).numarCont);
        banca.transfer(banca.getClientByName("Sokolova Diana").conts.get(1), banca.getClientByName("Ermakov Constantin").conts.get(0), 5400);
        banca.getClientByName("Sokolova Diana").getClientContsInfo();
        banca.getClientByName("Ermakov Constantin").getClientContsInfo();
    }
}
