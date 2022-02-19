public class Cont implements ContOperations {
    protected String numarCont;
    protected String valuta;
    protected double suma;

    Cont() {
    }

    Cont(String numarCont, String valuta, double suma) {
        this.numarCont = numarCont;
        this.suma = suma;

        if (valuta.equals("MDL") || valuta.equals("EUR")) {
            this.valuta = valuta;
        } else {
            this.valuta = "invalid";
        }
    }

    @Override
    public double getSumaTotala() {
        return this.suma + this.suma * getDobanda();
    }

    @Override
    public double getDobanda() {
        if (this.valuta.equals("MDL")) {
            if (this.suma < 500)
                return 0.3;
            else
                return 0.8;
        } else {
            return 0.1;
        }
    }
}