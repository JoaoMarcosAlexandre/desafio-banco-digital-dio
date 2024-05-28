package clientes.contas;

public class ContaPoupanca extends Conta {

    private double rendimentoTaxa;

    public ContaPoupanca(String numero, double taxaRendimento) {
        super(numero);
        this.rendimentoTaxa = taxaRendimento;
    }

    public double getRendimentoTaxa() {
        return rendimentoTaxa;
    }

    @Override
    public boolean transferir(Conta destino, double valor) {
        if (valor <= getSaldo()) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

}
