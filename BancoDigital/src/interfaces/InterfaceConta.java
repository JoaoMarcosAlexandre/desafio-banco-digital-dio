package interfaces;

public interface InterfaceConta {
    String getNumero();

    double getSaldo();

    // Operações da conta
    void depositar(double valor);

    boolean sacar(double valor);

    boolean transferir(InterfaceConta destino, double valor);
}
