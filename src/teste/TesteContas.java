package teste;

import modelo.ContaCorrente;
import modelo.SaldoInsuficienteException;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {
        // usada para instanciar e testar contas, métodos e interfaces
        ContaCorrente cc = new ContaCorrente(2525, 123756);
        cc.deposita(100);
        ContaCorrente cc2 = new ContaCorrente(1212, 293284);
        cc2.deposita(200);

        cc.transfere(110, cc2);

        System.out.println("Working!");




    }
}
