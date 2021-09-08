public class Cont implements Operations {
    protected String numarCont;
    protected String valuta;
    protected double suma;

    Cont()
    {}

    Cont(String numarCont, String valuta, double suma)
    {
        this.numarCont = numarCont;
        this.suma = suma;

        if(valuta == "MDL" || valuta == "EUR")
        {
            this.valuta = valuta;
        }
        else
        {
            this.valuta = "invalid";
        }
    }

    @Override
    public double getSumaTotala() {
        return this.suma + this.suma*getDobanda();
    }

    @Override
    public double getDobanda() {
        if(this.valuta == "MDL")
        {
            if(this.suma < 500)
                return 0.3;
            else
                return 0.8;
        }
        else
        {
            return 0.1;
        }
    }

    @Override
    public void depunere(Cont cont, double suma) {

    }

    @Override
    public void extragere(Cont cont, double suma) {

    }
}
