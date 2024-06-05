class ContaPoupanca extends ContaBancaria {
    private int saquesGratuitos;
    private int saquesRealizados;

    public ContaPoupanca(String numeroConta, String titular, double saldoInicial, int saquesGratuitos) {
        super(numeroConta, titular, saldoInicial);
        this.saquesGratuitos = saquesGratuitos;
        this.saquesRealizados = 0;
    }

    @Override
    public void sacar(double valor) {
        if (saquesRealizados < saquesGratuitos) {
            if (saldo >= valor) {
                saldo -= valor;
                saquesRealizados++;
            }
        } else {
            System.out.println("Limite de saques gratuitos excedido");
        }
    }
}
