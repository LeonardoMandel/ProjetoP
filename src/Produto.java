public class Produto { // Classe que representa um produto
    private String nome; // Atributo que armazena o nome do produto
    private String codigo; // Atributo que armazena o código do produto
    private double valor; // Atributo que armazena o valor do produto

    // Construtor da classe que inicializa os atributos
    public Produto(String nome, String codigo, double valor) {
        this.nome = nome; // Inicializa o atributo nome
        this.codigo = codigo; // Inicializa o atributo codigo
        this.valor = valor; // Inicializa o atributo valor
    }

    // Getters e Setters para acessar e modificar os atributos

    public String getNome() { // Método getter para o nome
        return nome; // Retorna o nome do produto
    }

    public void setNome(String nome) { // Método setter para o nome
        this.nome = nome; // Define um novo nome para o produto
    }

    public String getCodigo() { // Método getter para o código
        return codigo; // Retorna o código do produto
    }

    public void setCodigo(String codigo) { // Método setter para o código
        this.codigo = codigo; // Define um novo código para o produto
    }

    public double getValor() { // Método getter para o valor
        return valor; // Retorna o valor do produto
    }

    public void setValor(double valor) { // Método setter para o valor
        this.valor = valor; // Define um novo valor para o produto
    }

    public void exibirInformacoes() { // Método que exibe as informações do produto
        System.out.println("Código - " + this.codigo); // Exibe o código do produto
        System.out.println("Nome - " + this.nome); // Exibe o nome do produto
        System.out.println("Valor - " + this.valor); // Exibe o valor do produto
    }
}