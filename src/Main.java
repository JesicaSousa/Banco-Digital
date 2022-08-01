public class Main {
    public static void main(String[] args) {
        Cliente Jesica = new Cliente();
        Jesica.setNome("Jesica");
        Conta cp = new ContaPoupaca(Jesica);
        Conta cc = new ContaCorrente(Jesica);
        cc.depositar(1000);
        cc.imprimirExtrato();
        cc.transferir(30, cp);


        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}