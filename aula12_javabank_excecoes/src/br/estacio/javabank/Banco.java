package br.estacio.javabank;

import java.util.Scanner;

public class Banco {
    private Conta contaPadrao;
    private Scanner scanner;

    public Banco() {
        this.scanner = new Scanner(System.in);
        this.contaPadrao = new Conta(123, "Cliente Exemplo", 4567, 1000.00);
    }

    private Conta buscarConta(int numeroConta) {
        System.out.println("(Simulando busca no banco de dados...)"); 
        if (this.contaPadrao.getNumero() == numeroConta) {
            return this.contaPadrao; // Retorna a conta padrão se o número corresponder
        } else {
            return null; // Retorna null se o número não corresponder (conta não encontrada)
        }
    }

    public void executar() {
        System.out.println("--- Bem-vindo ao Sistema Bancario ---");

        Conta contaLogada = null; // Variável para guardar a conta logada
        final int MAX_TENTATIVAS = 3; // Define o número máximo de tentativas
        int tentativas = 0; // Contador de tentativas

        System.out.println("\n--- Login ---"); 

        while (contaLogada == null && tentativas < MAX_TENTATIVAS) {
            int numeroConta = 0;
            int pinInformado = 0;
            Conta contaTentativa = null;

            numeroConta = capturaValorInteiro("Informe o numero da conta: ");

            // Usa a função buscarConta para tentar encontrar a conta
            contaTentativa = buscarConta(numeroConta);

            // Verifica se a conta foi encontrada antes de pedir o PIN
            if (contaTentativa != null) {
                 pinInformado = capturaValorInteiro("Informe o PIN: ");
                 
                // Verifica o PIN da conta encontrada
                if (contaTentativa.verificarPin(pinInformado)) {
                    contaLogada = contaTentativa; // Login bem-sucedido
                    System.out.println("\nLogin bem-sucedido! Ola, " + contaLogada.getNomeTitular() + ".");
                } else {
                     tentativas++; // Incrementa apenas se o PIN estiver incorreto
                     System.out.println("PIN invalido. Tentativa " + tentativas + " de " + MAX_TENTATIVAS + ".");
                }
            } else {
                // Conta não encontrada
                tentativas++; // Incrementa se a conta não for encontrada
                System.out.println("Número da conta invalido. Tentativa " + tentativas + " de " + MAX_TENTATIVAS + ".");
            }
        }

        // Verifica se o login foi bem-sucedido após o loop
        if (contaLogada != null) {
            int opcao;
            do {
                exibirMenuOperacoes();                
                opcao = capturaValorInteiro("Escolha uma opcao: ");

                // Todas as operações são realizadas na conta logada
                switch (opcao) {
                    case 1: // Depósito
                        System.out.print("Informe o valor para deposito: R$");
                        // Lê como String e converte para double
                        String valorDepositoStr = scanner.nextLine();
                        // Sem tratamento de exceção - NumberFormatException ocorrerá
                        double valorDeposito = Double.parseDouble(valorDepositoStr);
                        contaLogada.depositar(valorDeposito);
                        break;
                    case 2: // Saque
                        System.out.print("Informe o valor para saque: R$");
                        // Lê como String e converte para double
                         String valorSaqueStr = scanner.nextLine();
                        // Sem tratamento de exceção - NumberFormatException ocorrerá
                         double valorSaque = Double.parseDouble(valorSaqueStr);
                        contaLogada.sacar(valorSaque);
                        break;
                    case 3: // Extrato
                        contaLogada.exibirExtrato();
                        break;
                    case 0: // Sair
                        System.out.println("Saindo da conta. Ate logo!");
                        break;
                    default:
                        System.out.println("Opção invalida. Tente novamente.");
                }
            } while (opcao != 0);
        } else {
            // O login falhou após as 3 tentativas
            System.out.println("Número maximo de tentativas de login atingido. O sistema será encerrado.");
        }

        scanner.close(); // Fechar o scanner ao sair
    }

    // Método para exibir o menu de operações
    private void exibirMenuOperacoes() {
        System.out.println("\n--- Menu de Operacoes ---");
        System.out.println("1. Deposito");
        System.out.println("2. Saque");
        System.out.println("3. Extrato");
        System.out.println("0. Sair");
    }
    
    private int capturaValorInteiro(String mensagem){
        System.out.print(mensagem);//exibe a mensagem solicitando o valor
        int valor = -1;
        String numeroContaStr = scanner.nextLine();
        try{
            valor = Integer.parseInt(numeroContaStr);
        }catch(NumberFormatException e){
            System.out.println("O valor deve ser um numero inteiro!. Tente novamente.");
        }
        return valor;
    }

    // Método main para iniciar a aplicação
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.executar();
    }
}