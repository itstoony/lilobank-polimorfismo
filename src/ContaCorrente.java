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
    public boolean saca(double saldo) {
        double sacaCorrente = saldo - getValorImposto();
        return super.saca(sacaCorrente);
    }

    @Override
    public boolean transfere(double valor, Conta destino) {
        double transfereCorrente = valor - getValorImposto();
        return super.transfere(transfereCorrente, destino);

    }

    public double getTaxaCorrente() {
        return getValorImposto();
    }

    public void setSaldo(double valor){
        this.saldo += valor;
    }

}
