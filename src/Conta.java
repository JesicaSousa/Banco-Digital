import java.util.Scanner;

public class Conta implements IConta {

    protected int valor;
    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUECIAL = 1;

    protected String Nome = "Jesica";
    protected int agencia;
    protected int numero;
    protected int saldo = 0;

    protected Cliente cliente;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUECIAL++;
    }

    @Override
    public void sacar() {

    }

    @Override
    public void depositar() {

    }

    @Override
    public void transferir() {

    }

    @Override
    public void imprimirExtrato() {

    }

    @Override
    public void sacar(int valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(int valor) {
        saldo +=  valor;
    }

    @Override
    public void transferir(int valor, Conta contaDestino) {
            this.sacar(valor);
            contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void extracted() {
        System.out.println("Titular: "+ this.Nome);
        System.out.println("Agencia: "+ this.agencia);
        System.out.println("número: " + this.numero);
        System.out.println("saldo: " + this.saldo);
    }

}
