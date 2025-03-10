import java.time.LocalDate;

public class Alimento extends Produto{

String categoria;
LocalDate dataValidade;

    public Alimento(String nome, String codigo, double valor, String categoria, LocalDate dataValidade) {
        super(nome, codigo, valor);
        this.categoria = categoria;
        this.dataValidade = dataValidade;
    }
}
