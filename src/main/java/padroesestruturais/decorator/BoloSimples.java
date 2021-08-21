package padroesestruturais.decorator;

public class BoloSimples implements Bolo {

    public float valor;

    public BoloSimples() {
    }

    public BoloSimples(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public String getEstrutura() {
        return "Bolo Simples";
    }

}
