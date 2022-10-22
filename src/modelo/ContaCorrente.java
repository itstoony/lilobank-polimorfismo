package modelo;

public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int agencia, int conta) {
        super(agencia, conta);
        CalculadorDeImpostos impostos = new CalculadorDeImpostos();
    }

    @Override
    public double getValorImposto() {
        return 0.20;
    }


    @Override
    public void deposita(double saldo) {
        super.saldo += saldo;
    }

    @Override
    public void saca(double saldo) throws SaldoInsuficienteException {
        double sacaCorrente = saldo - getValorImposto();
        super.saca(sacaCorrente);
    }

    @Override
    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        double transfereCorrente = valor - getValorImposto();
        super.transfere(transfereCorrente, destino);

    }

    public double getTaxaCorrente() {
        return getValorImposto();
    }

    public void setSaldo(double valor){
        this.saldo += valor;
    }

}
