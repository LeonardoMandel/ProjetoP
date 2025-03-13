import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        ArrayList<Alimento> alimentos = new ArrayList<>();
        ArrayList<Eletronico> eletronicos = new ArrayList<>();
        ArrayList<Roupa> roupas = new ArrayList<>();

        int opcao;

        do {
            opcao = menu.imprimirMensagem(sc);  // Solicita a opção principal

            switch (opcao) {

                case 1:
                    System.out.println("O que Você deseja Incluir? \n" +
                            "(1) Eletronico - (2) Roupa - (3) Alimento - (0) Cancelar");

                    int opcao1 = sc.nextInt();
                    sc.nextLine(); // Consumir a quebra de linha pendente

                    switch (opcao1) {
                        case 0:
                            break; // Volta ao menu principal
                        case 1:
                            while (true) {
                                System.out.print("Nome: ");
                                String nome = sc.nextLine();

                                System.out.print("Código: ");
                                String codigo = sc.nextLine();

                                System.out.print("Qual o valor: ");
                                double valor = sc.nextDouble();
                                sc.nextLine(); // Consumir a quebra de linha pendente

                                System.out.print("Marca: ");
                                String marca = sc.nextLine();

                                System.out.print("Garantia em Meses: ");
                                int garantiaMeses = sc.nextInt();
                                sc.nextLine(); // Consumir a quebra de linha pendente

                                // Criando o objeto Eletronico com os valores fornecidos
                                Eletronico eletronico = new Eletronico(nome, codigo, valor, marca, garantiaMeses);

                                // Adicionando o produto ao ArrayList
                                eletronicos.add(eletronico);

                                System.out.print("Deseja adicionar outro produto? (s/n): ");
                                String resposta = sc.nextLine();

                                if (!resposta.equalsIgnoreCase("s")) {
                                    break; // Sai do loop se a resposta não for "s"
                                }
                            }
                            break;
                        case 2:
                            while (true) {
                                System.out.print("Nome: ");
                                String nome = sc.nextLine();

                                System.out.print("Código: ");
                                String codigo = sc.nextLine();

                                System.out.print("Qual o valor: ");
                                double valor = sc.nextDouble();
                                sc.nextLine(); // Consumir a quebra de linha pendente

                                System.out.print("Tamanho: ");
                                String tamanho = sc.nextLine();

                                System.out.print("Material: ");
                                String material = sc.nextLine();

                                Roupa roupa = new Roupa(nome, codigo, valor, tamanho, material);

                                // Adicionando o produto ao ArrayList
                                roupas.add(roupa);

                                System.out.print("Deseja adicionar outro produto? (s/n): ");
                                String resposta = sc.nextLine();

                                if (!resposta.equalsIgnoreCase("s")) {
                                    break; // Sai do loop se a resposta não for "s"
                                }
                            }
                            break;
                        case 3:
                            while (true) {
                                System.out.print("Nome: ");
                                String nome = sc.nextLine();

                                System.out.print("Código: ");
                                String codigo = sc.nextLine();

                                System.out.print("Qual o valor: ");
                                double valor = sc.nextDouble();
                                sc.nextLine(); // Consumir a quebra de linha pendente

                                System.out.print("Qual a categoria: ");
                                String categoria = sc.nextLine();

                                // Lendo a data de validade como String e convertendo para LocalDate
                                System.out.print("Data de Validade (AAAA-MM-DD): ");
                                String dataValidadeStr = sc.nextLine();
                                LocalDate dataValidade = LocalDate.parse(dataValidadeStr); // Converte a String para LocalDate

                                // Criando o objeto Alimento com os valores fornecidos
                                Alimento alimento = new Alimento(nome, codigo, valor, categoria, dataValidade);

                                // Adicionando o produto ao ArrayList
                                alimentos.add(alimento);

                                System.out.print("Deseja adicionar outro produto? (s/n): ");
                                String resposta = sc.nextLine();

                                if (!resposta.equalsIgnoreCase("s")) {
                                    break; // Sai do loop se a resposta não for "s"
                                }
                            }
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("O que Você deseja Alterar? \n" +
                            "(1) Eletronico - (2) Roupa - (3) Alimento - (0) Cancelar");

                    int opcao2 = sc.nextInt();
                    sc.nextLine(); // Consumir a quebra de linha pendente

                    switch (opcao2) {
                        case 0:
                            break; // Volta ao menu principal
                        case 1:
                            System.out.println("Alterando Eletrônico...");
                            break;
                        case 2:
                            System.out.println("Alterando Roupa...");
                            break;
                        case 3:
                            System.out.println("Alterando Alimento...");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("O que Você deseja Excluir? \n" +
                            "(1) Eletronico - (2) Roupa - (3) Alimento - (0) Cancelar");

                    int opcao3 = sc.nextInt();
                    sc.nextLine(); // Consumir a quebra de linha pendente

                    switch (opcao3) {
                        case 0:
                            break; // Volta ao menu principal
                        case 1:
                            System.out.println("Excluindo Eletrônico...");
                            break;
                        case 2:
                            System.out.println("Excluindo Roupa...");
                            break;
                        case 3:
                            System.out.println("Excluindo Alimento...");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("O que Você deseja listar? \n" +
                            "(1) Eletronico - (2) Roupa - (3) Alimento - (0) Cancelar");

                    int opcao4 = sc.nextInt();
                    sc.nextLine(); // Consumir a quebra de linha pendente

                    switch (opcao4) {
                        case 0:
                            break; // Volta ao menu principal
                        case 1:
                            System.out.println("Listando Eletrônico...");
                            break;
                        case 2:
                            System.out.println("Listando Roupa...");
                            break;
                        case 3:
                            System.out.println("Listando Alimento...");
                            break;
                        default:
                            System.out.println("Opção inválida.");
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
        } while (opcao != 5); // Repete até que o usuário escolha sair (opção 5)

        sc.close(); // Fecha o Scanner
    }
}

class Menu {
    public int imprimirMensagem(Scanner sc) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~ Bem Vindo ~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Escolha uma das Opções: \n" +
                "(1) - Incluir \n" +
                "(2) - Alterar \n" +
                "(3) - Excluir \n" +
                "(4) - Listar \n" +
                "(5) - Sair");

        return sc.nextInt();  // Retorna a opção escolhida pelo usuário
    }
}