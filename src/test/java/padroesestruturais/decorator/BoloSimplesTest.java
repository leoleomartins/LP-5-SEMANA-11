package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoloSimplesTest {

    @Test
    void deveRetornarValorBolo() {
        Bolo bolo = new BoloSimples(1000.0f);

        assertEquals(1000.0f, bolo.getValor());
    }

    @Test
    void deveRetornarValorBoloComCobertura() {
        Bolo bolo = new Cobertura(new BoloSimples(1000.0f));

        assertEquals(1100.0f, bolo.getValor());
    }

    @Test
    void deveRetornarValorBoloComGlace() {
        Bolo bolo = new Glace(new BoloSimples(1000.0f));

        assertEquals(1050.0f, bolo.getValor());
    }

    @Test
    void deveRetornarValorBoloComRecheio() {
        Bolo bolo = new Recheio(new BoloSimples(1000.0f));

        assertEquals(1200.0f, bolo.getValor());
    }

    @Test
    void deveRetornarValorBoloComCoberturaMaisGlace() {
        Bolo bolo = new Cobertura(new Glace(new BoloSimples(1000.0f)));

        assertEquals(1155.0f, bolo.getValor());
    }

    @Test
    void deveRetornarValorBoloComCoberturaMaisRecheio() {
        Bolo bolo = new Cobertura(new Recheio(new BoloSimples(1000.0f)));

        assertEquals(1320.0f, bolo.getValor());
    }

    @Test
    void deveRetornarValorBoloComGlaceMaisRecheio() {
        Bolo bolo = new Glace(new Recheio(new BoloSimples(1000.0f)));

        assertEquals(1260.0f, bolo.getValor());
    }

    @Test
    void deveRetornarValorBoloComCoberturaMaisGlaceMaisRecheio() {
        Bolo bolo = new Cobertura(new Glace(new Recheio(new BoloSimples(1000.0f))));

        assertEquals(1386.0f, bolo.getValor());
    }

    @Test
    void deveRetornarEstruturaBolo() {
        Bolo bolo = new BoloSimples();

        assertEquals("Bolo Simples", bolo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaBoloComCobertura() {
        Bolo bolo = new Cobertura(new BoloSimples());

        assertEquals("Bolo Simples/Cobertura", bolo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaBoloComGlace() {
        Bolo bolo = new Glace(new BoloSimples());

        assertEquals("Bolo Simples/Glace", bolo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaBoloComRecheio() {
        Bolo bolo = new Recheio(new BoloSimples());

        assertEquals("Bolo Simples/Recheio", bolo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaBoloComCoberturaMaisGlace() {
        Bolo bolo = new Cobertura(new Glace (new BoloSimples()));

        assertEquals("Bolo Simples/Glace/Cobertura", bolo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaBoloComCoberturaMaisRecheio() {
        Bolo bolo = new Cobertura(new Recheio (new BoloSimples()));

        assertEquals("Bolo Simples/Recheio/Cobertura", bolo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaBoloComGlaceMaisRecheio() {
        Bolo bolo = new Glace(new Recheio (new BoloSimples()));

        assertEquals("Bolo Simples/Recheio/Glace", bolo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaBoloComCoberturaMaisGlaceMaisRecheio() {
        Bolo bolo = new Cobertura (new Glace(new Recheio (new BoloSimples())));

        assertEquals("Bolo Simples/Recheio/Glace/Cobertura", bolo.getEstrutura());
    }


}
