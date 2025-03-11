import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner escolha = new Scanner(System.in);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~ Bem Vindo ~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Escolha uma das Opções: \n" +
                "(1) - Listar \n" +
                "(2) - Alterar \n" +
                "(3) - Excluir \n" +
                "(4) - Exibir Lista");

        int opcao = escolha.nextInt();  // Lê a entrada do usuário

        switch (opcao) {
            case 1:
                System.out.println("O que Você deseja listar? \n" +
                        "");
                break;
            case 2:
                System.out.println("Você escolheu Alterar.");
                break;
            case 3:
                System.out.println("Você escolheu Excluir.");
                break;
            case 4:
                System.out.println("Você escolheu Exibir Lista.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

    Eletronico e1 = new Eletronico("TV","ABC",2999.99,"Samsung",12);

    e1.exibirInformacoes();

    }
}