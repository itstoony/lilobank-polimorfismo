package modelo;

public abstract class Conta {
    protected double saldo; // private, usado para encapsulamento
    private int agencia;
    private int conta;
    private Cliente titular;
    private static int total; // total de contas criadas


    public Conta(int agencia, int conta){
            Conta.total++;
            this.agencia = agencia;
            this.conta = conta;
    }

    public static int getTotal() {
        return total;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public abstract void deposita(double saldo);

    public void saca (double saldo) throws SaldoInsuficienteException{
        if(this.saldo < saldo){
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + saldo);
        }
    }

    public void transfere(double valor,  Conta destino) throws SaldoInsuficienteException{
            if(this.saldo < valor){
                throw new SaldoInsuficienteException("Saldo: " + this.getSaldo() + ", Valor: " + valor);
            }
    }

    public double getSaldo(){
        // usado para ver o saldo das contas encapsuladas.
        return this.saldo;
    }

    public void setAgencia(int numeroDaAgencia){
        if(numeroDaAgencia > 0 || numeroDaAgencia < 9999){
            this.agencia += numeroDaAgencia;
        } else{
            System.out.println("Número de agência inválido!");
        }

    }
    public int getAgencia(){
        return this.agencia;
    }


}


