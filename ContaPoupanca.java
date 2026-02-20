public class ContaPoupanca extends Conta implements OperacoesBancarias{

    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public void atualizarSaldo() {
        double rendimento = getSaldo() * 0.003;
        depositar(rendimento);
        System.out.println("Conta Poupança - Rendimento Obtido: R$" + rendimento);
    }

    @Override
    public void transferir(Conta destino, double valor) {
        try {
            sacar(valor);
            destino.depositar(valor);
            System.out.println("Conta Poupança transferiu R$" + valor + " para a conta: " + destino.getNumero()+ " com êxito.");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Conta Poupança - A transferência falhou: " + e.getMessage());
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n-------------------------");
        System.out.println("Extrato da Conta Poupança");
        System.out.println("-------------------------" );
        System.out.println("Número: " + getNumero());
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: R$" + getSaldo());
    }
}
