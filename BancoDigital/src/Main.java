import banco.Banco;
import clientes.Cliente;
import clientes.contas.ContaCorrente;
import clientes.contas.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Criando contas para clientes
        ContaCorrente contaCorrente = new ContaCorrente("123", 1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("456", 0.05);

        // Criando clientes
        Cliente cliente1 = new Cliente("João Alexandre", "111.111.111-11", contaCorrente);
        Cliente cliente2 = new Cliente("Gabriella", "222.222.222-22", contaPoupanca);

        // Adicionando clientes ao banco
        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        // Realizando operações bancárias
        cliente1.getConta().depositar(500);
        cliente2.getConta().depositar(1000);
        cliente1.getConta().transferir(cliente2.getConta(), 300);

        // Exibindo informações
        System.out.println("Saldo do cliente " + cliente1.getNome() + ": R$" + cliente1.getConta().getSaldo());
        System.out.println("Saldo do cliente " + cliente2.getNome() + ": R$" + cliente2.getConta().getSaldo());
    }
}
