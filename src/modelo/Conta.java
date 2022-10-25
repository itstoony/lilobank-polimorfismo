package modelo;

import java.util.ArrayList;

public abstract class Conta {

    protected double saldo; // protected, disponível apenas para filhos
    private int agencia;
    private int conta;
    private Cliente titular;
    private static final ArrayList<Conta> contas = new ArrayList<>();


    public Conta(int agencia, int conta){
        /**
         * Construtor de conta a partir de parâmetros "agencia" e "conta"
         * @param agencia
         * @param conta
         */
            this.agencia = agencia;
            this.conta = conta;
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

    public void saca (double valor) throws SaldoInsuficienteException{
        /**
         * Valor precisa ser maior que valor
         * @param valor
         * @throws SaldoInsuficienteException
         */
        if(this.saldo < valor){
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
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

    @Override
    public String toString() {
        /**
         * Returns tipo da conta, número e agência
         */
        return  "Número: " + this.conta + ", Agência: " + this.agencia + "\n";
    }

    protected void addContas(Conta a){
        /**
         * Adiciona conta ao Array de contas através da referência
         * @param reference
         */
        contas.add(a);
    }

    public static ArrayList<Conta> getContas() {
        /**
         * Array que guarda todas as contas por referência
         */
        return contas;
    }

    public static String totalContas(){
        return "Total de contas: " + contas.size();
    }


}


