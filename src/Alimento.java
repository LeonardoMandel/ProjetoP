public class Alimento extends Produto { // Classe Alimento que herda da classe Produto

    private String categoria; // Atributo que armazena a categoria do alimento
    private String dataValidade; // Atributo que armazena a data de validade como uma String

    // Construtor da classe Alimento que inicializa os atributos
    public Alimento(String nome, String codigo, double valor, String categoria, String dataValidade) {
        super(nome, codigo, valor); // Chama o construtor da classe pai (Produto) para inicializar nome, codigo e valor
        this.categoria = categoria; // Inicializa o atributo categoria
        this.dataValidade = dataValidade; // Armazena a data de validade como String
    }

    // Getters e Setters para acessar e modificar os atributos

    public String getCategoria() { // Método getter para a categoria
        return categoria; // Retorna a categoria do alimento
    }

    public void setCategoria(String categoria) { // Método setter para a categoria
        this.categoria = categoria; // Define uma nova categoria para o alimento
    }

    public String getDataValidade() { // Método getter para a data de validade
        return dataValidade; // Retorna a data de validade do alimento
    }

    public void setDataValidade(String dataValidade) { // Método setter para a data de validade
        this.dataValidade = dataValidade; // Define uma nova data de validade para o alimento
    }

    // Método para exibir informações do alimento
    @Override
    public void exibirInformacoes() { // Sobrescreve o método exibirInformacoes da classe pai
        super.exibirInformacoes(); // Chama o método exibirInformacoes da classe pai (Produto)
        System.out.println("Categoria: " + categoria); // Exibe a categoria do alimento
        System.out.println("Data de Validade: " + dataValidade); // Exibe a data de validade do alimento
    }
}