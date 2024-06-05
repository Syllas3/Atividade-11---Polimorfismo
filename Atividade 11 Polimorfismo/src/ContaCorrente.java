class ContaCorrente extends ContaBancaria {
    private double taxaOperacao;

    public ContaCorrente(String numeroConta, String titular, double saldoInicial, double taxaOperacao) {
        super(numeroConta, titular, saldoInicial);
        this.taxaOperacao = taxaOperacao;
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= (valor + taxaOperacao)) {
            saldo -= (valor + taxaOperacao);
        }
    }
}
