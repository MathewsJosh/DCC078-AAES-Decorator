package padroesestruturais.decorator;

public class Cozinha extends padroesestruturais.decorator.ComodoDecorator {

    public Cozinha(Comodo comodo) {
        super(comodo);
    }

    public int getValorQtdBanheiros() {
        return 0;
    }

    public int getValorQtdJanelas() {
        return 1;
    }

    public String getNome() {
        return "Cozinha";
    }
}
