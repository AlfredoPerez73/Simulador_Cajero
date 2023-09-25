package Metodos;

 // @author Alfredo

public class Usuario {
    
    private String Id;
    private String transaccion;

    public Usuario() {
    }
    public Usuario(String Id, String transaccion) {
        this.Id = Id;
        this.transaccion = transaccion;
    }
    public String getId() {
        return Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }
    public String getTransaccion() {
        return transaccion;
    }
    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }
    
}
