package padroescomportamentais.visitor;

public class Confeiteiro implements Funcionario {

    private int registro;
    private String nome;
    private float salario;

    public Confeiteiro(int registro, String nome, float salario) {
        this.registro = registro;
        this.nome = nome;
        this.salario = salario;
    }

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirConfeiteiro(this);
    }
}
