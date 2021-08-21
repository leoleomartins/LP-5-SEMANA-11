package padroesestruturais.decorator;

public class Cobertura extends BoloDecorator{

    public Cobertura(Bolo bolo){
        super(bolo);
    }

    public float getPercentualValor(){
        return 10f;
    }

    public String getNomeEstrutura(){
        return "Cobertura";
    }
}
