public class IngressoFamilia extends Ingresso{
    private int qtdPessoas;

    public IngressoFamilia(double valor, String nomeFilme, String lingFilme, int qtdPessoas){
        super();
        this.qtdPessoas = qtdPessoas;
    }

    @Override
    public double getValorReal(){
        double total = getValor() * qtdPessoas;
        if (qtdPessoas > 3){
            total *= 0.95;
        }
        return total;
    }
}
