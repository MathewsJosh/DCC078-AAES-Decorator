package padroesestruturais.decorator;

public class Ambiente implements Comodo {
    public String nome;
    public int qtdjanelas;
    public int qtdbanheiros;


    public Ambiente(String nome, int qtdjanelas, int qtdbanheiros) {
        this.nome = nome;
        this.qtdjanelas = qtdjanelas;
        this.qtdbanheiros = qtdbanheiros;
    }

    public int getQtdJanelas() {
        return this.qtdjanelas;
    }

    public int getQtdBanheiros() {
        return this.qtdbanheiros;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDetalhes() {
        return "O Comodo" + getNome() + "possui " + getQtdJanelas()
                + " janelas e " + getQtdBanheiros() + " banheiros.";
    }

}
