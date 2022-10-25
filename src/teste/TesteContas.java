package teste;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;
import modelo.SaldoInsuficienteException;



public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {

        // usada para instanciar e testar contas, métodos e interfaces
        ContaCorrente cc = new ContaCorrente(2525, 123756);
        ContaPoupanca cp = new ContaPoupanca(1212, 293284);
        ContaPoupanca cp1 = new ContaPoupanca(28547, 182376);
        ContaPoupanca cp2 = new ContaPoupanca(28913, 102385);
        ContaCorrente cc1 = new ContaCorrente(12384, 123951);

        cc.deposita(150);
        cc.saca(100);
        System.out.println(Conta.getContas());
        System.out.println(Conta.totalContas());






    }
}
