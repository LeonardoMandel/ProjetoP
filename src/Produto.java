public class Produto {

   private String nome;
   private String codigo;
   private double valor;

    public Produto(String nome, String codigo, double valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
    }

    public void exibirInformacoes(){
        System.out.println("Código - "+this.codigo);
        System.out.println("Nome - "+this.nome);
        System.out.println("Valor - "+this.valor +" meses");

    }
}
