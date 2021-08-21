package padroescomportamentais.visitor;

public class Cozinheiro implements Funcionario {

    private int registro;
    private String nome;
    private String especialidade;

    public Cozinheiro(int registro, String nome, String especialidade) {
        this.registro = registro;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCozinheiro(this);
    }
}
