public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero, Cliente titular){
        super(agencia, numero, titular);
    }

    @Override // Aqui é um metodo de sobreescrição. adicionei uma taxa a transação
    public boolean sacar(double valor) {
        double novoValor = valor + 2;
        return super.sacar(novoValor);
    }

    @Override
    public void gerarExtrato() {
        System.out.println("Gerando extrato para Conta Corrente");

    }
}
