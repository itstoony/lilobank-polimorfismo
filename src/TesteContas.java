public class TesteContas {
    public static void main(String[] args) {
        // usada para instanciar e testar contas, métodos e interfaces
        ContaPoupanca cp = new ContaPoupanca(111, 111);
        cp.deposita(1000.00);

        ContaCorrente cc = new ContaCorrente(222, 222);
        cc.deposita(1000.00);
        cp.transfere(100, cc);
        cc.saca(100);
        cc.deposita(1000);
        cc.transfere(2000, cp);

        ContaCorrente conta = new ContaCorrente(2222, 273618);
        conta.setSaldo(2000);

        CalculadorDeImpostos calculador = new CalculadorDeImpostos();
        calculador.registra(conta);
        System.out.println(conta.getSaldo());
        System.out.println(conta.getValorImposto());
        System.out.println(calculador.getTotalImposto());

    }
}
