package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComodoTest {

    @Test
    void deveRetornargetQtdJanelasAmbiente() {
        Comodo comodo = new Ambiente("Ambiente", 0, 0);
        assertEquals(0, comodo.getQtdJanelas());
    }

    @Test
    void deveRetornargetQtdJanelasCozinha() {
        Comodo comodo = new Cozinha(new Ambiente("Cozinha", 0, 0));
        assertEquals(1, comodo.getQtdJanelas());
    }

    @Test
    void deveRetornargetQtdJanelasVaranda() {
        Comodo comodo = new Varanda(new Ambiente("Ambiente", 0, 0));
        assertEquals(3, comodo.getQtdJanelas());
    }

    @Test
    void deveRetornargetQtdJanelasSala() {
        Comodo comodo = new Sala(new Ambiente("Ambiente", 0, 0));
        assertEquals(2, comodo.getQtdJanelas());
    }

    @Test
    void deveRetornargetQtdJanelasCozinhaMaisVaranda() {
        Comodo comodo = new Cozinha(new Varanda(new Ambiente("Ambiente", 0, 0)));
        assertEquals(4, comodo.getQtdJanelas());
    }

    @Test
    void deveRetornargetQtdJanelasCozinhaMaisSala() {
        Comodo comodo = new Cozinha(new Sala(new Ambiente("Ambiente", 0, 0)));
        assertEquals(3, comodo.getQtdJanelas());
    }

    @Test
    void deveRetornargetQtdJanelasVarandaMaisSala() {
        Comodo comodo = new Varanda(new Sala(new Ambiente("Ambiente", 0, 0)));
        assertEquals(5, comodo.getQtdJanelas());
    }

    @Test
    void deveRetornargetQtdJanelasCozinhaMaisVarandaMaisSala() {
        Comodo comodo = new Cozinha(new Varanda(new Sala(new Ambiente("Ambiente", 0, 0))));
        assertEquals(6, comodo.getQtdJanelas());
    }

    @Test
    void deveRetornargetQtdBanheirosAmbiente() {
        Comodo comodo = new Ambiente("Ambiente", 0, 0);
        assertEquals(0, comodo.getQtdBanheiros());
    }

    @Test
    void deveRetornargetQtdBanheirosCozinha() {
        Comodo comodo = new Cozinha(new Ambiente("Ambiente", 0, 0));
        assertEquals(0, comodo.getQtdBanheiros());
    }

    @Test
    void deveRetornargetQtdBanheirosVaranda() {
        Comodo comodo = new Varanda(new Ambiente("Ambiente", 0, 0));
        assertEquals(2, comodo.getQtdBanheiros());
    }

    @Test
    void deveRetornargetQtdBanheirosSala() {
        Comodo comodo = new Sala(new Ambiente("Ambiente", 0, 0));
        assertEquals(1, comodo.getQtdBanheiros());
    }

    @Test
    void deveRetornargetQtdBanheirosCozinhaMaisVaranda() {
        Comodo comodo = new Cozinha(new Varanda(new Ambiente("Ambiente", 0, 0)));
        assertEquals(2, comodo.getQtdBanheiros());
    }

    @Test
    void deveRetornargetQtdBanheirosCozinhaMaisSala() {
        Comodo comodo = new Cozinha(new Sala(new Ambiente("Ambiente", 0, 0)));
        assertEquals(1, comodo.getQtdBanheiros());
    }

    @Test
    void deveRetornargetQtdBanheirosVarandaMaisSala() {
        Comodo comodo = new Varanda(new Sala(new Ambiente("Ambiente", 0, 0)));
        assertEquals(3, comodo.getQtdBanheiros());
    }

    @Test
    void deveRetornargetQtdBanheirosCozinhaMaisVarandaMaisSala() {
        Comodo comodo = new Cozinha(new Sala(new Sala(new Ambiente("Ambiente", 0, 0))));
        assertEquals(2, comodo.getQtdBanheiros());
    }

}