package teste;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

import java.util.ArrayList;


public class TesteContas {
    public static void main(String[] args) {

        ArrayList<Conta> conts = new ArrayList<>();

        // usada para instanciar e testar contas, métodos e interfaces
        ContaCorrente cc = new ContaCorrente(13, 12);
        ContaCorrente cc1 = new ContaCorrente(1312, 812367);
        ContaPoupanca cp = new ContaPoupanca(1671, 12371);
        ContaPoupanca cp1 = new ContaPoupanca(1231, 9712378);
        ContaPoupanca cp2 = new ContaPoupanca(11, 11);

        conts.add(cc);
        conts.add(cc1);
        conts.add(cp);
        conts.add(cp1);
        conts.add(cp2);


        ContaCorrente testar = new ContaCorrente(11, 11);



        boolean validacao = conts.contains(testar);
        System.out.println("Valida : " + validacao);

//        Boolean valida = cp.igualdade(cp1);
//        System.out.println(valida);










    }
}
