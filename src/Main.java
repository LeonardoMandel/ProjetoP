import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();
        menu.imprimirMensagem(Scanner sc);
        switch (opcao) {
            case 1:
                System.out.println("O que Você deseja Incluir? \n" +
                        "(1) Eletronico - (2) Roupa - (3) Alimento - (0) Cancelar");

                int opcao1 = sc.nextInt();

                switch (opcao1){
                    case 0:

                        break;
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                }
                break;

            case 2:
                System.out.println("O que Você deseja Alterar? \n" +
                    "(1) Eletronico - (2) Roupa - (3) Alimento - (0) Cancelar");

                int opcao2 = sc.nextInt();

                switch (opcao2){
                    case 0:

                        break;
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                }
                break;
            case 3:
                System.out.println("O que Você deseja Excluir? \n" +
                        "(1) Eletronico - (2) Roupa - (3) Alimento - (0) Cancelar");

                int opcao3 = sc.nextInt();

                switch (opcao3){
                    case 0:

                        break;
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                }
                break;
            case 4:
                System.out.println("O que Você deseja listar? \n" +
                        "(1) Eletronico - (2) Roupa - (3) Alimento - (0) Cancelar");

                int opcao0 = sc.nextInt();

                switch (opcao0){
                    case 0:

                        break;
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                }
                break;
            case 5:
                System.out.println("Obrigado, Volte sempre!");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }


        }

        public void imprimirMensagem(Scanner sc) {

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~ Bem Vindo ~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Escolha uma das Opções: \n" +
                    "(1) - Incluir \n" +
                    "(2) - Alterar \n" +
                    "(3) - Excluir \n" +
                    "(4) - Listar \n" +
                    "(5) - Sair");

            int opcao = sc.nextInt();  // Lê a entrada do usuário

    }
}