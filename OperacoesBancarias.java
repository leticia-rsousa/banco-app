public interface OperacoesBancarias {
    void transferir(Conta destino, double valor);

    void imprimirExtrato();
}
