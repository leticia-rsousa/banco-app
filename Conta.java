import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    private int numero;
    private String titular;
    private double saldo;
    private List<String> historicoOperacoes = new ArrayList<>();

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
        historicoOperacoes.add("Deposito de " +valor+ " realizado com sucesso!\nSaldo atualizado: R$" + saldo + "\n");
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if(valor > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }
        else{
            this.saldo -= valor;
            historicoOperacoes.add("Saque de " +valor+ " realizado com sucesso!\nSaldo atualizado: R$" + saldo);
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<String> getHistoricoOperacoes() {
        return historicoOperacoes;
    }

    public abstract void atualizarSaldo();
}
