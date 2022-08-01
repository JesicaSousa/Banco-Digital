import java.util.Scanner;

public interface IConta {
    void sacar();

    void depositar();

    void transferir();

    void imprimirExtrato();


    void sacar(int valor);

    void depositar(int valor);

    void transferir(int valor, Conta contaDestino);

}
