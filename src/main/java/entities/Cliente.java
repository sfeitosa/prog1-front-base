package entities;

public class Cliente {
    private Long id;
    private String cpf;
    private String nome;
    private String dataNasc;

    public Cliente() {
    }
    
    public Cliente(Long id, String cpf, String nome, String dataNasc) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNasc = dataNasc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
