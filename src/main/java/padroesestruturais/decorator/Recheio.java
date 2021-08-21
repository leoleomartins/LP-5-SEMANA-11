package padroesestruturais.decorator;

public class Recheio extends BoloDecorator{
    public Recheio(Bolo bolo){
        super(bolo);
    }

    public float getPercentualValor(){
        return 20f;
    }

    public String getNomeEstrutura(){
        return "Recheio";
    }
}
