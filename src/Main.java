public class Main {
    public static void main(String[] args) {
        Cliente filipe = new Cliente();
        filipe.setNome("Filipe");

        Conta cc = new ContaCorrente(filipe);
        Conta poupanca = new ContaPoupanca(filipe);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
