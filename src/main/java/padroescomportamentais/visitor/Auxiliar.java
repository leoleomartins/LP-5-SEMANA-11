package padroescomportamentais.visitor;

public class Auxiliar implements Funcionario {

    private int registro;
    private String nome;
    private Receita receita;

    public Auxiliar(int registro, String nome, Receita receita) {
        this.registro = registro;
        this.nome = nome;
        this.receita = receita;
    }

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeReceita() {
        return this.receita.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirAuxiliar(this);
    }
}
