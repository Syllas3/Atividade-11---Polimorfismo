abstract class ContaBancaria {
    private String numeroConta;
    private String titular;
    protected double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public abstract void sacar(double valor);

    public void transferir(double valor, ContaBancaria destino) {
        if (saldo >= valor) {
            sacar(valor);
            destino.depositar(valor);
        }
    }

    @Override
    public String toString() {
        return "Conta: " + numeroConta + ", Titular: " + titular + ", Saldo: " + saldo;
    }
}
