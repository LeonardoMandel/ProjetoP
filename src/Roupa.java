public class Roupa extends Produto { // Classe Roupa que herda da classe Produto

    private String tamanho; // Atributo que armazena o tamanho da roupa
    private String material; // Atributo que armazena o material da roupa

    // Construtor da classe Roupa que inicializa os atributos
    public Roupa(String nome, String codigo, double valor, String tamanho, String material) {
        super(nome, codigo, valor); // Chama o construtor da classe pai (Produto) para inicializar nome, codigo e valor
        this.tamanho = tamanho; // Inicializa o atributo tamanho
        this.material = material; // Inicializa o atributo material
    }

    // Getters e Setters para acessar e modificar os atributos

    public String getTamanho() { // Método getter para o tamanho
        return tamanho; // Retorna o tamanho da roupa
    }

    public void setTamanho(String tamanho) { // Método setter para o tamanho
        this.tamanho = tamanho; // Define um novo tamanho para a roupa
    }

    public String getMaterial() { // Método getter para o material
        return material; // Retorna o material da roupa
    }

    public void setMaterial(String material) { // Método setter para o material
        this.material = material; // Define um novo material para a roupa
    }

    @Override
    public void exibirInformacoes() { // Sobrescreve o método exibirInformacoes da classe pai
        super.exibirInformacoes(); // Chama o método exibirInformacoes da classe pai (Produto)
        System.out.println("Tamanho: " + tamanho); // Exibe o tamanho da roupa
        System.out.println("Material: " + material); // Exibe o material da roupa
    }
}