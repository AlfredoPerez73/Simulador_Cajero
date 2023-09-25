package Metodos;

 // @author Alfredo

public class Caja extends Usuario {
    
    private String Idr;
    private int saldo;
    private int saldoActual;
    private String transaccionIdr;

    public Caja() {
    }
    public Caja(String Idr, int saldo, int saldoActual, String transaccionIdr) {
        this.Idr = Idr;
        this.saldo = saldo;
        this.saldoActual = saldoActual;
        this.transaccionIdr = transaccionIdr;
    }
    public Caja(String Id, String transaccion, String Idr, int saldo, int saldoActual, String transaccionIdr) {
        super(Id, transaccion);
        this.Idr = Idr;
        this.saldo = saldo;
        this.saldoActual = saldoActual;
        this.transaccionIdr = transaccionIdr;
    }
    public String getIdr() {
        return Idr;
    }
    public void setIdr(String Idr) {
        this.Idr = Idr;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public int getSaldoActual() {
        return saldoActual;
    }
    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    public String getTransaccionIdr() {
        return transaccionIdr;
    }
    public void setTransaccionIdr(String transaccionIdr) {
        this.transaccionIdr = transaccionIdr;
    }
}
