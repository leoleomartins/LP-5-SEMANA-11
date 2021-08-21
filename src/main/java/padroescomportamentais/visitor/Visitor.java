package padroescomportamentais.visitor;

public interface Visitor {
    String exibirAuxiliar(Auxiliar auxiliar);
    String exibirCozinheiro(Cozinheiro cozinheiro);
    String exibirConfeiteiro(Confeiteiro confeiteiro);
}
