public class Roupa extends Produto{

    String tamanho;
    String material;

    public Roupa(String nome, String codigo, double valor, String tamanho, String material) {
        super(nome, codigo, valor);
        this.tamanho = tamanho;
        this.material = material;
    }
}

