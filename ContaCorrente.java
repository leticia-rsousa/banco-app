public class ContaCorrente extends Conta implements OperacoesBancarias{

    public ContaCorrente(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public void atualizarSaldo() {
        double taxa = getSaldo() * 0.005;
        try{
            sacar(taxa);
            System.out.println("Conta Corrente - Taxa de Operação: R$" + taxa);
        } catch(SaldoInsuficienteException e){
            System.out.println("Conta Corrente - Não foi possível aplicar a taxa: " +e.getMessage());
        }
    }

    @Override
    public void transferir(Conta destino, double valor) {
        try{
            sacar(valor);
            destino.depositar(valor);
            System.out.println("Conta Corrente transferiu R$" + valor + " para a conta: " + destino.getNumero()+ " com êxito.");
        }catch (SaldoInsuficienteException e) {
            System.out.println("Conta Corrente - A transferência falhou: " + e.getMessage());
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n-------------------------");
        System.out.println("Extrato da Conta Corrente");
        System.out.println("-------------------------" );
        System.out.println("Número: " + getNumero());
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: R$" + getSaldo());
    }
}
