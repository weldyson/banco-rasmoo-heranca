public class TestAbstract {

    public static void main(String[] args) {
        Cliente weldyson = new Cliente("Weldyson de Azevedo", "02121212132");
        //Conta conta = new Conta(1258, 4857, weldyson);

        ContaCorrente cc = new ContaCorrente(1234, 22554,weldyson);
        ContaPoupanca cp = new ContaPoupanca(1234, 22554,weldyson);

        cc.gerarExtrato();
        cp.gerarExtrato();
    }


}
