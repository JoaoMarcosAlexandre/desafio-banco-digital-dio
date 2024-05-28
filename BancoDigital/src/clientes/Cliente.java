package clientes;

import clientes.contas.Conta;

public class Cliente {

    // Cadastro do cliente
    private String nome;
    private String cpf;
    private Conta conta;

    public Cliente(String nome, String cpf, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return cpf;
    }

    public Conta getConta() {
        return conta;
    }

}
