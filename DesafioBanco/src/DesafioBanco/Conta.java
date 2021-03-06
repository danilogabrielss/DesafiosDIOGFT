package DesafioBanco;

import java.time.LocalDate;

public abstract class Conta implements IConta {

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        LocalDate dataTransfer = LocalDate.now();
        dataTransfer.plusDays(1);
        System.out.println("Esta transferencia ir� ser depositada apenas no dia " + dataTransfer.plusDays(1) + " de "
                + cliente.getNome() + " para " + contaDestino.cliente.getNome() + " no valor de R$" + valor);
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void transferirPix(double valor, Conta contaDestino) {
        System.out.println("Transferencia feita de " + cliente.getNome() + " para "
                + contaDestino.cliente.getNome() + " no valor de R$" + valor + " com sucesso.");
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

    protected void infosComuns() {
        System.out.println(String.format("Nome do Titular: %s ", this.cliente.getNome()));
        System.out.println(String.format("CPF: ", this.cliente.getCpf()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
