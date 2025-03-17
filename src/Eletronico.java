public class Eletronico extends Produto { // Classe Eletronico que herda da classe Produto
    private String marca; // Atributo que armazena a marca do eletrônico
    private int garantiaMeses; // Atributo que armazena o tempo de garantia em meses

    // Construtor da classe Eletronico que inicializa os atributos
    public Eletronico(String nome, String codigo, double valor, String marca, int garantiaMeses) {
        super(nome, codigo, valor); // Chama o construtor da classe pai (Produto) para inicializar nome, codigo e valor
        this.marca = marca; // Inicializa o atributo marca
        this.garantiaMeses = garantiaMeses; // Inicializa o atributo garantiaMeses
    }

    // Getters e Setters específicos de Eletronico

    public String getMarca() { // Método getter para a marca
        return marca; // Retorna a marca do eletrônico
    }

    public void setMarca(String marca) { // Método setter para a marca
        this.marca = marca; // Define uma nova marca para o eletrônico
    }

    public int getGarantiaMeses() { // Método getter para a garantia em meses
        return garantiaMeses; // Retorna o tempo de garantia em meses
    }

    public void setGarantiaMeses(int garantiaMeses) { // Método setter para a garantia em meses
        this.garantiaMeses = garantiaMeses; // Define um novo tempo de garantia em meses
    }

    @Override
    public void exibirInformacoes() { // Sobrescreve o método exibirInformacoes da classe pai
        super.exibirInformacoes(); // Chama o método exibirInformacoes da classe pai (Produto)
        System.out.println("Marca - " + this.marca); // Exibe a marca do eletrônico
        System.out.println("Tempo de Garantia - " + this.garantiaMeses + " meses"); // Exibe o tempo de garantia
    }
}