package Metodos;

 // @author Alfredo

public class Banco extends Caja {

    public Banco() {
    }
    public Banco(String Id, String transaccion, String Idr, int saldo, int saldoActual, String transaccionIdr) {
        super(Id, transaccion, Idr, saldo, saldoActual, transaccionIdr);
    }
}
