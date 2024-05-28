package banco;

import java.util.Map;
import clientes.Cliente;

import java.util.HashMap;

public class Banco {
    private Map<String, Cliente> clientes;

    public Banco() {
        this.clientes = new HashMap<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.put(cliente.getCPF(), cliente);
    }

    public Cliente buscarCliente(String cpf) {
        return clientes.get(cpf);
    }

}
