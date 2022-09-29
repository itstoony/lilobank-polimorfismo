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

    public boolean saca (double saldo){
        if(this.saldo >= saldo){
            this.saldo -= saldo;
            System.out.println("Saque realizado com sucesso!");
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor,  Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferência realizada com sucesso!");
            return true;
        } else {
            return false;
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


