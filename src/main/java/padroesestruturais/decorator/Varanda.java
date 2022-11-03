package padroesestruturais.decorator;

public class Varanda extends padroesestruturais.decorator.ComodoDecorator {

    public Varanda(Comodo comodo) {
        super(comodo);
    }

    public int getValorQtdBanheiros() {
        return 2;
    }

    public int getValorQtdJanelas() {
        return 3;
    }

    public String getNome() {
        return "Varanda";
    }
}
