package br.estacio.javabank;

import java.text.DecimalFormat;

public class Conta {
    private int numero;
    private double saldo;
    private String nomeTitular;
    private int pin; // Atributo para o PIN

    // Construtor
    public Conta(int numero, String nomeTitular, int pin, double saldoInicial) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.pin = pin;
        this.saldo = saldoInicial; // Definindo saldo inicial
        System.out.println("Conta criada com sucesso para " + nomeTitular + ".");
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método para verificar o PIN
    public boolean verificarPin(int pinInformado) {
        return this.pin == pinInformado;
    }

    // Método para Depósito
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + formatarMoeda(valor) + " realizado com sucesso.");
        } else {
            System.out.println("Valor para depósito inválido.");
        }
    }

    // Método para Saque
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + formatarMoeda(valor) + " realizado com sucesso.");
            return true; // Saque bem-sucedido
        } else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
            return false; // Saque falhou por falta de saldo
        } else {
             System.out.println("Valor para saque inválido.");
             return false; // Saque falhou por valor inválido
        }
    }

    // Método para Exibir Extrato
    public void exibirExtrato() {
        System.out.println("\n--- Extrato da Conta ---");
        System.out.println("Número da Conta: " + this.numero);
        System.out.println("Titular: " + this.nomeTitular);
        System.out.println("Saldo Atual: R$" + formatarMoeda(this.saldo));
        System.out.println("------------------------\n");
    }

    // Método auxiliar para formatar valores monetários
    private String formatarMoeda(double valor) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(valor);
    }

    // Método para Transferência (Precisa da conta de destino) - A lógica principal estará no Banco
    public boolean transferirPara(Conta destino, double valor) {
        if (this.sacar(valor)) { // Tenta sacar da conta de origem
            destino.depositar(valor); // Se sacar for bem-sucedido, deposita na destino
            System.out.println("Transferência de R$" + formatarMoeda(valor) + " para a conta " + destino.getNumero() + " realizada com sucesso.");
            return true;
        }
        return false; // Transferência falhou (saque falhou)
    }
}
