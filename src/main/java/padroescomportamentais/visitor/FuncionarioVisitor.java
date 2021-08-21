package padroescomportamentais.visitor;

public class FuncionarioVisitor implements Visitor {

    public String exibir(Funcionario funcionario) {
        return funcionario.aceitar(this);
    }

    @Override
    public String exibirAuxiliar(Auxiliar auxiliar) {
        return "Auxiliar{" +
                "registro=" + auxiliar.getRegistro() +
                ", nome='" + auxiliar.getNome() + '\'' +
                ", receita=" + auxiliar.getNomeReceita() +
                '}';
    }

    @Override
    public String exibirCozinheiro(Cozinheiro cozinheiro) {
        return "Cozinheiro{" +
                "registro=" + cozinheiro.getRegistro() +
                ", nome='" + cozinheiro.getNome() + '\'' +
                ", especialidade='" + cozinheiro.getEspecialidade() + '\'' +
                '}';
    }

    @Override
    public String exibirConfeiteiro(Confeiteiro confeiteiro) {
        return "Confeiteiro{" +
                "registro=" + confeiteiro.getRegistro() +
                ", nome='" + confeiteiro.getNome() + '\'' +
                ", salario=" + confeiteiro.getSalario() +
                '}';
    }
}
