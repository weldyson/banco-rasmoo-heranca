package BancoHeranca;

public class TesteHeranca {
    public static void main(String[] args) {

        Cliente weldyson = new Cliente("Weldyson", "12345655");
        ContaCorrente cc = new ContaCorrente(1298, 8734, weldyson);

        cc.depositar(10000);
        cc.sacar(50.752);

        ContaPoupanca cp = new ContaPoupanca(1298, 4368, weldyson);

        cc.transferir(500, cp);
        cp.depositar(5000);

        System.out.println("O saldo da CC " + cc.getSaldo());
        System.out.println("O saldo da CP " + cc.getSaldo());



    }


}
