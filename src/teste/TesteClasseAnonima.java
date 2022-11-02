package teste;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;
import modelo.OrdenaLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteClasseAnonima {
    public static void main(String[] args) {
        /*
        * Classe unicamente para testar a sintaxe de classes anônimas
        * */
        Conta cc1 = new ContaCorrente(22,33);
        cc1.deposita(333.0);
        Conta cc2 = new ContaPoupanca(22, 44);
        cc2.deposita(444);
        Conta cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111);
        Conta cc4 = new ContaCorrente(22, 22);
        cc4.deposita(222);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        lista.sort(new Comparator<Conta>() {
            // automaticamente é gerada uma classe anônima "classe sem nome"
            @Override
            public int compare(Conta c1, Conta c2) {
                if(c1.getNumeroDeConta() > c2.getNumeroDeConta()){
                    return 1;
                }
                if(c1.getNumeroDeConta() < c2.getNumeroDeConta()){
                    return -1;
                }
                return 0;
            }
        });
        System.out.println(lista);

        Collections.rotate(lista,3);

        System.out.println(" ------------------------ ");

        System.out.println(lista);


    }
}
