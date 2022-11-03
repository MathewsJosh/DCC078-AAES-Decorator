package padroesestruturais.decorator;

public class Sala extends padroesestruturais.decorator.ComodoDecorator {

    public Sala(Comodo comodo) {
        super(comodo);
    }

    public int getValorQtdBanheiros() {
        return 1;
    }

    public int getValorQtdJanelas() {
        return 2;
    }

    public String getNome() {
        return "Sala";
    }
}
