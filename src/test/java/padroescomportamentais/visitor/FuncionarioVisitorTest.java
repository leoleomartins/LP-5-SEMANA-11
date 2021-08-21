package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioVisitorTest {

    @Test
    void deveExibirAuxiliar() {
        Auxiliar auxiliar = new Auxiliar(1, "Pedro", new Receita("Macarrão"));

        FuncionarioVisitor visitor = new FuncionarioVisitor();
        assertEquals("Auxiliar{registro=1, nome='Pedro', receita=Macarrão}", visitor.exibir(auxiliar));
    }

    @Test
    void deveExibirCozinheiro() {
        Cozinheiro cozinheiro = new Cozinheiro(1, "João", "Comida Italiana");

        FuncionarioVisitor visitor = new FuncionarioVisitor();
        assertEquals("Cozinheiro{registro=1, nome='João', especialidade='Comida Italiana'}",
                visitor.exibir(cozinheiro));
    }

    @Test
    void deveExibirConfeiteiro() {
        Confeiteiro confeiteiro = new Confeiteiro(1, "Antonio", 3000.0f);

        FuncionarioVisitor visitor = new FuncionarioVisitor();
        assertEquals("Confeiteiro{registro=1, nome='Antonio', salario=3000.0}", visitor.exibir(confeiteiro));
    }
}
