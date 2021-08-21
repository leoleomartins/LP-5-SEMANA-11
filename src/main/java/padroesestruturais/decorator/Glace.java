package padroesestruturais.decorator;

public class Glace extends BoloDecorator{

    public Glace(Bolo bolo){
        super(bolo);
    }

    public float getPercentualValor(){
        return 5f;
    }

    public String getNomeEstrutura(){
        return "Glace";
    }
}
