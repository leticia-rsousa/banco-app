public class BancoApp {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(12345, "Lucas", 1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca(34567, "Aline", 4000);

        System.out.println("\nConta Corrente - Seu saldo atual é de: R$" + contaCorrente.getSaldo());
        System.out.println("Conta Poupança - Seu saldo atual é de: R$" + contaPoupanca.getSaldo());

        contaCorrente.depositar(200);
        contaPoupanca.depositar(200);

        try{
            contaCorrente.sacar(300);
        }catch (SaldoInsuficienteException e){
            contaCorrente.getHistoricoOperacoes().add("Erro ao sacar: " + e.getMessage());
        }
        try{
            contaPoupanca.sacar(500);
        }catch (SaldoInsuficienteException e){
            contaPoupanca.getHistoricoOperacoes().add("Erro ao sacar: " + e.getMessage());
        }

        System.out.println("\n=== Conta Corrente: Depositos e Saques ===");
        for(String i : contaCorrente.getHistoricoOperacoes()){
            System.out.println(i);
        }
        System.out.println("\n=== Conta Poupança: Depositos e Saques ===");
        for(String i : contaPoupanca.getHistoricoOperacoes()){
            System.out.println(i);
        }

        System.out.println("\n=== Transferências ===");
        contaCorrente.transferir(contaPoupanca, 100);
        contaPoupanca.transferir(contaCorrente, 1000);

        System.out.println("\n=== Taxas e Rendimentos ===");
        contaCorrente.atualizarSaldo();
        contaPoupanca.atualizarSaldo();

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
