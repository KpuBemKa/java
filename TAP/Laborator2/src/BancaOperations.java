public interface BancaOperations {
    void depunere(Cont destination, double suma);
    void extragere(Cont destination, double suma);
    void transfer(Cont sender, Cont reciever, double suma);
}
