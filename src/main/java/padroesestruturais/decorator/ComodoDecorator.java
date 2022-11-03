package padroesestruturais.decorator;

import padroesestruturais.decorator.Comodo;

public abstract class ComodoDecorator implements Comodo {

    private Comodo comodo;
    public String nome;

    public ComodoDecorator(Comodo comodo) {
        this.comodo = comodo;
    }

    public Comodo getComodo() {
        return comodo;
    }

    public abstract int getValorQtdJanelas();

    public int getQtdJanelas() {
        return this.comodo.getQtdJanelas() + this.getValorQtdJanelas();
    }

    public abstract int getValorQtdBanheiros();

    public int getQtdBanheiros() {
        return this.comodo.getQtdBanheiros() + this.getValorQtdBanheiros();
    }

    public abstract String getNome();

    public void setNome(String nome) {
        this.nome = nome;
    }

}


