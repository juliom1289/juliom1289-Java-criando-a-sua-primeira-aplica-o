import java.util.Scanner;

public class PrimeiroProjeto {


    public static void operacoesClass(String nome, String usuarioConta, float saldoConta) {
        String operacoes = String.format("""
                ***************************************************
                Dados iniciais do cliente:
                
                
                Nome:              %s
                Tipo de Conta:     %s
                Saldo Inicial:     %.2f
                ***************************************************
                
                
                Operações:
                
                1-  Consultar saldo
                2-  Receber valor
                3-  Transferir valor
                4-  Sair
                
                Digite a operação desejada:
                """, nome, usuarioConta, saldoConta);
        System.out.println(operacoes);
        operacoesAcao(nome, usuarioConta, saldoConta);

    }

    public static void operacoesAcao(String nome, String usuarioConta, float saldoConta) {
        Scanner leitura = new Scanner(System.in);
        int inputNumeroOperacao = leitura.nextInt();

        while (inputNumeroOperacao < 1 || inputNumeroOperacao > 4 ) {
            System.out.println("O número digitado deve ser inteiro e estar entre 1 e 4," +
                    " contando esses últimos");
            inputNumeroOperacao = leitura.nextInt();
        }

        if (inputNumeroOperacao == 1) {
            System.out.println(String.format("Atualmente, sua conta possui: R$%.2f", saldoConta));
        } else if (inputNumeroOperacao == 2) {
            System.out.println("Valor recebido: ");
            double valorRecebido = leitura.nextDouble();
            saldoConta += valorRecebido;
            System.out.println(String.format("Atualmente, sua conta possui: R$%.2f", saldoConta));
        } else if (inputNumeroOperacao == 3) {
            System.out.println("Valor transferido: ");
            double valorTransferido = leitura.nextDouble();
            if (valorTransferido > saldoConta) {
                System.out.println("Saldo insuficiente");
            } else {
                saldoConta -= valorTransferido;
                System.out.println(String.format("Atualmente, sua conta possui: R$%.2f", saldoConta));
            }
        } else {
            System.out.println("Programa encerrado com sucesso");;
            throw new Error("Encerrando o programa.");
        }

        operacoesClass(nome, usuarioConta, saldoConta);
        leitura.close();

    }


    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Usuario, como gostaria de ser chamado? ");
        String nome = leitura.nextLine();

        System.out.println(String.format("%s, qual é o tipo da sua conta? ", nome));
        String tiposDeContas;
        tiposDeContas = """
                [1] Conta Corrente
                [2] Conta Poupança
                [3] Conta Salário
                [4] Conta Conjunta
                [5] Conta de Depósito a Prazo (CDB)
                [6] Conta Universitária
                [7] Conta Digital
                [8] Conta de Investimento
                [9] Conta Comercial
                """;
        System.out.println(tiposDeContas);
        int inputNumeroConta = leitura.nextInt();

        while (inputNumeroConta < 1 || inputNumeroConta > 9 ) {
            System.out.println("O número digitado deve ser inteiro e estar entre 1 e 9," +
                    " contando esses últimos");
            inputNumeroConta = leitura.nextInt();
        }

        String usuarioConta;
        switch (inputNumeroConta) {
            case 1 -> usuarioConta = "Conta Corrente";
            case 2 -> usuarioConta = "Conta Poupança";
            case 3 -> usuarioConta = "Conta Salário";
            case 4 -> usuarioConta = "Conta Conjunta";
            case 5 -> usuarioConta = "Conta de Depósito a Prazo (CDB)";
            case 6 -> usuarioConta = "Conta Universitária";
            case 7 -> usuarioConta = "Conta Digital";
            case 8 -> usuarioConta = "Conta Investimento";
            default -> usuarioConta = "Conta Comercial";
        }

        System.out.println(String.format("%s, qual é o saldo, com centavos, da sua conta (use , ao invés de .)? ", nome));
        float saldoConta = leitura.nextFloat();


        operacoesClass(nome, usuarioConta, saldoConta);

        leitura.close();
    }



}

