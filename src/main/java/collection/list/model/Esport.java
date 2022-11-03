package collection.list.model;

public class Esport implements Comparable<Esport> {

    private String nomeE;
    private Integer numeroJogadores;
    private String cor;

    public Esport(String esport, Integer numeroJogadores, String cor) {
        this.nomeE = esport;
        this.numeroJogadores = numeroJogadores;
        this.cor = cor;
    }

    public void setNomeE(String nomeE) {
        this.nomeE = nomeE;
    }

    public void setNumeroJogadores(Integer numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNomeE() {
        return nomeE;
    }

    public Integer getNumeroJogadores() {
        return numeroJogadores;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "esport='" + nomeE + '\'' +
                ", numeroJogadores=" + numeroJogadores +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Esport esport1) {
        return this.getNomeE().compareToIgnoreCase(esport1.getNomeE());
    }
}
