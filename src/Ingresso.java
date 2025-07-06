public class Ingresso {
    private double valor;
    private String nomeFilme;
    private String lingFilme;


    public Ingresso(){
        this.valor = 15;
        this.nomeFilme = "Como treinar seu dragão";
        this.lingFilme = "Dublado";
    }

    public double getValorReal(){
        return valor;
    }



    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getLingFilme() {
        return lingFilme;
    }

    public void setLingFilme(String lingFilme) {
        this.lingFilme = lingFilme;
    }
}
