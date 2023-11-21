package entities;

public class Cartao {
    private Long id;
    private Cliente cliente;
    private String numero;
    private String dataVal;

    public Cartao() {
    }

    public Cartao(Long id, Cliente cliente, String numero, String dataVal) {
        this.id = id;
        this.cliente = cliente;
        this.numero = numero;
        this.dataVal = dataVal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDataVal() {
        return dataVal;
    }

    public void setDataVal(String dataVal) {
        this.dataVal = dataVal;
    }
    
    
}
