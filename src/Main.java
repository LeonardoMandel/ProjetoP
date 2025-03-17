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

                case 1: // Incluir
                    System.out.println("O que você deseja incluir? \n" +
                            "(1) Eletrônico - (2) Roupa - (3) Alimento - (0) Cancelar");

                    int opcao1 = sc.nextInt();
                    sc.nextLine(); // Consumir a quebra de linha pendente

                    switch (opcao1) {
                        case 0:
                            break; // Volta ao menu principal
                        case 1: // Incluir Eletrônico
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

                                System.out.print("Garantia em meses: ");
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
                        case 2: // Incluir Roupa
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
                        case 3: // Incluir Alimento
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

                                // Lendo a data de validade como String
                                System.out.print("Data de validade (AAAA-MM-DD): ");
                                String dataValidade = sc.nextLine();

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

                case 2: // Alterar
                    System.out.println("O que você deseja alterar? \n" +
                            "(1) Eletrônico - (2) Roupa - (3) Alimento - (0) Cancelar");

                    int opcao2 = sc.nextInt();
                    sc.nextLine(); // Consumir a quebra de linha pendente

                    switch (opcao2) {
                        case 0:
                            break; // Volta ao menu principal
                        case 1: // Alterar Eletrônico
                            System.out.println("Qual eletrônico deseja alterar?");
                            // Exibe a lista de eletrônicos disponíveis
                            for (int i = 0; i < eletronicos.size(); i++) {
                                System.out.println("Eletrônico " + (i + 1) + ":"); // Começa a partir de 1
                                eletronicos.get(i).exibirInformacoes();
                                System.out.println("-----------------------------");
                            }

                            // Solicita o número do eletrônico a ser alterado
                            System.out.print("Digite o número do eletrônico que deseja alterar: ");
                            int numeroEletronico = sc.nextInt();
                            sc.nextLine(); // Consumir a quebra de linha pendente

                            // Verifica se o número é válido
                            if (numeroEletronico >= 1 && numeroEletronico <= eletronicos.size()) {
                                Eletronico eletronico = eletronicos.get(numeroEletronico - 1); // Ajusta para índice 0-based

                                // Solicita os novos dados
                                System.out.print("Novo nome: ");
                                String novoNome = sc.nextLine();

                                System.out.print("Novo código: ");
                                String novoCodigo = sc.nextLine();

                                System.out.print("Novo valor: ");
                                double novoValor = sc.nextDouble();
                                sc.nextLine(); // Consumir a quebra de linha pendente

                                System.out.print("Nova marca: ");
                                String novaMarca = sc.nextLine();

                                System.out.print("Nova garantia (em meses): ");
                                int novaGarantia = sc.nextInt();
                                sc.nextLine(); // Consumir a quebra de linha pendente

                                // Atualiza os atributos do eletrônico
                                eletronico.setNome(novoNome);
                                eletronico.setCodigo(novoCodigo);
                                eletronico.setValor(novoValor);
                                eletronico.setMarca(novaMarca);
                                eletronico.setGarantiaMeses(novaGarantia);

                                System.out.println("Eletrônico alterado com sucesso!");
                            } else {
                                System.out.println("Número inválido!");
                            }
                            break;
                        case 2: // Alterar Roupa
                            System.out.println("Qual roupa deseja alterar?");
                            // Exibe a lista de roupas disponíveis
                            for (int i = 0; i < roupas.size(); i++) {
                                System.out.println("Roupa " + (i + 1) + ":"); // Começa a partir de 1
                                roupas.get(i).exibirInformacoes();
                                System.out.println("-----------------------------");
                            }

                            // Solicita o número da roupa a ser alterada
                            System.out.print("Digite o número da roupa que deseja alterar: ");
                            int numeroRoupa = sc.nextInt();
                            sc.nextLine(); // Consumir a quebra de linha pendente

                            // Verifica se o número é válido
                            if (numeroRoupa >= 1 && numeroRoupa <= roupas.size()) {
                                Roupa roupa = roupas.get(numeroRoupa - 1); // Ajusta para índice 0-based

                                // Solicita os novos dados
                                System.out.print("Novo nome: ");
                                String novoNome = sc.nextLine();

                                System.out.print("Novo código: ");
                                String novoCodigo = sc.nextLine();

                                System.out.print("Novo valor: ");
                                double novoValor = sc.nextDouble();
                                sc.nextLine(); // Consumir a quebra de linha pendente

                                System.out.print("Novo tamanho: ");
                                String novoTamanho = sc.nextLine();

                                System.out.print("Novo material: ");
                                String novoMaterial = sc.nextLine();

                                // Atualiza os atributos da roupa
                                roupa.setNome(novoNome);
                                roupa.setCodigo(novoCodigo);
                                roupa.setValor(novoValor);
                                roupa.setTamanho(novoTamanho);
                                roupa.setMaterial(novoMaterial);

                                System.out.println("Roupa alterada com sucesso!");
                            } else {
                                System.out.println("Número inválido!");
                            }
                            break;
                        case 3: // Alterar Alimento
                            System.out.println("Qual alimento deseja alterar?");
                            // Exibe a lista de alimentos disponíveis
                            for (int i = 0; i < alimentos.size(); i++) {
                                System.out.println("Alimento " + (i + 1) + ":"); // Começa a partir de 1
                                alimentos.get(i).exibirInformacoes();
                                System.out.println("-----------------------------");
                            }

                            // Solicita o número do alimento a ser alterado
                            System.out.print("Digite o número do alimento que deseja alterar: ");
                            int numeroAlimento = sc.nextInt();
                            sc.nextLine(); // Consumir a quebra de linha pendente

                            // Verifica se o número é válido
                            if (numeroAlimento >= 1 && numeroAlimento <= alimentos.size()) {
                                Alimento alimento = alimentos.get(numeroAlimento - 1); // Ajusta para índice 0-based

                                // Solicita os novos dados
                                System.out.print("Novo nome: ");
                                String novoNome = sc.nextLine();

                                System.out.print("Novo código: ");
                                String novoCodigo = sc.nextLine();

                                System.out.print("Novo valor: ");
                                double novoValor = sc.nextDouble();
                                sc.nextLine(); // Consumir a quebra de linha pendente

                                System.out.print("Nova categoria: ");
                                String novaCategoria = sc.nextLine();

                                System.out.print("Nova data de validade (AAAA-MM-DD): ");
                                String novaDataValidade = sc.nextLine();

                                // Atualiza os atributos do alimento
                                alimento.setNome(novoNome);
                                alimento.setCodigo(novoCodigo);
                                alimento.setValor(novoValor);
                                alimento.setCategoria(novaCategoria);
                                alimento.setDataValidade(novaDataValidade);

                                System.out.println("Alimento alterado com sucesso!");
                            } else {
                                System.out.println("Número inválido!");
                            }
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;

                case 3: // Excluir
                    System.out.println("O que você deseja excluir? \n" +
                            "(1) Eletrônico - (2) Roupa - (3) Alimento - (0) Cancelar");

                    int opcao3 = sc.nextInt();
                    sc.nextLine(); // Consumir a quebra de linha pendente

                    switch (opcao3) {
                        case 0:
                            break; // Volta ao menu principal
                        case 1: // Excluir Eletrônico
                            System.out.println("Qual eletrônico deseja excluir?");
                            // Exibe a lista de eletrônicos disponíveis
                            for (int i = 0; i < eletronicos.size(); i++) {
                                System.out.println("Eletrônico " + (i + 1) + ":"); // Começa a partir de 1
                                eletronicos.get(i).exibirInformacoes();
                                System.out.println("-----------------------------");
                            }

                            // Solicita o número do eletrônico a ser excluído
                            System.out.print("Digite o número do eletrônico que deseja excluir: ");
                            int numeroEletronico = sc.nextInt();
                            sc.nextLine(); // Consumir a quebra de linha pendente

                            // Verifica se o número é válido
                            if (numeroEletronico >= 1 && numeroEletronico <= eletronicos.size()) {
                                eletronicos.remove(numeroEletronico - 1); // Ajusta para índice 0-based
                                System.out.println("Eletrônico excluído com sucesso!");
                            } else {
                                System.out.println("Número inválido!");
                            }
                            break;
                        case 2: // Excluir Roupa
                            System.out.println("Qual roupa deseja excluir?");
                            // Exibe a lista de roupas disponíveis
                            for (int i = 0; i < roupas.size(); i++) {
                                System.out.println("Roupa " + (i + 1) + ":"); // Começa a partir de 1
                                roupas.get(i).exibirInformacoes();
                                System.out.println("-----------------------------");
                            }

                            // Solicita o número da roupa a ser excluída
                            System.out.print("Digite o número da roupa que deseja excluir: ");
                            int numeroRoupa = sc.nextInt();
                            sc.nextLine(); // Consumir a quebra de linha pendente

                            // Verifica se o número é válido
                            if (numeroRoupa >= 1 && numeroRoupa <= roupas.size()) {
                                roupas.remove(numeroRoupa - 1); // Ajusta para índice 0-based
                                System.out.println("Roupa excluída com sucesso!");
                            } else {
                                System.out.println("Número inválido!");
                            }
                            break;
                        case 3: // Excluir Alimento
                            System.out.println("Qual alimento deseja excluir?");
                            // Exibe a lista de alimentos disponíveis
                            for (int i = 0; i < alimentos.size(); i++) {
                                System.out.println("Alimento " + (i + 1) + ":"); // Começa a partir de 1
                                alimentos.get(i).exibirInformacoes();
                                System.out.println("-----------------------------");
                            }

                            // Solicita o número do alimento a ser excluído
                            System.out.print("Digite o número do alimento que deseja excluir: ");
                            int numeroAlimento = sc.nextInt();
                            sc.nextLine(); // Consumir a quebra de linha pendente

                            // Verifica se o número é válido
                            if (numeroAlimento >= 1 && numeroAlimento <= alimentos.size()) {
                                alimentos.remove(numeroAlimento - 1); // Ajusta para índice 0-based
                                System.out.println("Alimento excluído com sucesso!");
                            } else {
                                System.out.println("Número inválido!");
                            }
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;

                case 4: // Listar
                    System.out.println("O que você deseja listar? \n" +
                            "(1) Eletrônico - (2) Roupa - (3) Alimento - (0) Cancelar");

                    int opcao4 = sc.nextInt();
                    sc.nextLine(); // Consumir a quebra de linha pendente

                    switch (opcao4) {
                        case 0:
                            break; // Volta ao menu principal
                        case 1: // Listar Eletrônicos
                            System.out.println("Listando Eletrônicos...");
                            for (int i = 0; i < eletronicos.size(); i++) {
                                System.out.println("Eletrônico " + (i + 1) + ":"); // Começa a partir de 1
                                eletronicos.get(i).exibirInformacoes();
                                System.out.println("-----------------------------");
                            }
                            break;
                        case 2: // Listar Roupas
                            System.out.println("Listando Roupas...");
                            for (int i = 0; i < roupas.size(); i++) {
                                System.out.println("Roupa " + (i + 1) + ":"); // Começa a partir de 1
                                roupas.get(i).exibirInformacoes();
                                System.out.println("-----------------------------");
                            }
                            break;
                        case 3: // Listar Alimentos
                            System.out.println("Listando Alimentos...");
                            for (int i = 0; i < alimentos.size(); i++) {
                                System.out.println("Alimento " + (i + 1) + ":"); // Começa a partir de 1
                                alimentos.get(i).exibirInformacoes();
                                System.out.println("-----------------------------");
                            }
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;

                case 5: // Sair
                    System.out.println("Obrigado, volte sempre!");
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
        System.out.println("Escolha uma das opções: \n" +
                "(1) - Incluir \n" +
                "(2) - Alterar \n" +
                "(3) - Excluir \n" +
                "(4) - Listar \n" +
                "(5) - Sair");

        return sc.nextInt();  // Retorna a opção escolhida pelo usuário
    }
}