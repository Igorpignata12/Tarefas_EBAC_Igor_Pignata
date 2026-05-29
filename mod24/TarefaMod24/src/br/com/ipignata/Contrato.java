package br.com.ipignata;

/**
 * @author Igor Pignata
 */

public class Contrato {
    private Long cpf;
    private String status;

    public Contrato(Long cpf, String status){
        this.cpf = cpf;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}