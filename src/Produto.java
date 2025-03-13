public class Produto {
    private String nome;
    private String codigo;
    private double valor;

    public Produto(String nome, String codigo, double valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void exibirInformacoes() {
        System.out.println("Código - " + this.codigo);
        System.out.println("Nome - " + this.nome);
        System.out.println("Valor - " + this.valor);
    }
}