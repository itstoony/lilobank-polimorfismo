package teste;

import modelo.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteOrderLists {
    /*
    Classe usada apenas para fins educacionais e estudo de Java.util
    * */
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22,33);
        Cliente clientecc1 = new Cliente("B Tony", "222.222.222.22", "Desenvolvedor");
        cc1.deposita(333.0);
        cc1.setTitular(clientecc1);


        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente cliencecc2 = new Cliente("A Maria do Carmo", "111111.111-22", "Recepcionista");
        cc2.deposita(444);
        cc2.setTitular(cliencecc2);


        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clientecc3 = new Cliente("D Paulo", "333.333.333-33", "Mecânico");
        cc3.deposita(111);
        cc3.setTitular(clientecc3);


        Conta cc4 = new ContaCorrente(22, 22);
        Cliente clientecc4 = new Cliente("C Gustavo", "444.444.444-44", "Controlador");
        cc4.setTitular(clientecc4);
        cc4.deposita(222);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println(lista);
        lista.sort(Comparator.comparingInt(Conta::getNumeroDeConta));

        System.out.println(" ------------------------ ");

        System.out.println(lista);
        System.out.println(" ------------------------ ");
        lista.sort(Comparator.comparing(c -> c.getTitular().getNome()));

        System.out.println(lista);

    }
}

