import java.util.ArrayList;

class GerenciamentoContas {
    private ArrayList<ContaBancaria> contas;

    public GerenciamentoContas() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void depositar(String numeroConta, double valor) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                conta.depositar(valor);
            }
        }
    }

    public void sacar(String numeroConta, double valor) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                conta.sacar(valor);
            }
        }
    }

    public void transferir(String numeroContaOrigem, String numeroContaDestino, double valor) {
        ContaBancaria contaOrigem = null;
        ContaBancaria contaDestino = null;
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numeroContaOrigem)) {
                contaOrigem = conta;
            }
            if (conta.getNumeroConta().equals(numeroContaDestino)) {
                contaDestino = conta;
            }
        }
        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.transferir(valor, contaDestino);
        }
    }

    public void listarContas() {
        for (ContaBancaria conta : contas) {
            System.out.println(conta);
        }
    }
}
