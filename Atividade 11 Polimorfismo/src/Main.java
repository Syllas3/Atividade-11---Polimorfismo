public class Main {
    public static void main(String[] args) {
        GerenciamentoContas gerenciamento = new GerenciamentoContas();

        ContaCorrente cc = new ContaCorrente("123", "João", 1000, 5);
        ContaPoupanca cp = new ContaPoupanca("456", "Maria", 2000, 3);

        gerenciamento.adicionarConta(cc);
        gerenciamento.adicionarConta(cp);

        gerenciamento.depositar("123", 200);
        gerenciamento.sacar("123", 50);
        gerenciamento.transferir("456", "123", 500);

        gerenciamento.listarContas();
    }
}
