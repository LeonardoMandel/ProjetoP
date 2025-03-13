public class Eletronico extends Produto {
    private String marca;
    private int garantiaMeses;

    public Eletronico(String nome, String codigo, double valor, String marca, int garantiaMeses) {
        super(nome, codigo, valor);
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

    // Getters e Setters específicos de Eletronico
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Marca - " + this.marca);
        System.out.println("Tempo de Garantia - " + this.garantiaMeses + " meses");
    }
}