public class MeiaEntrada extends Ingresso{

    public MeiaEntrada(double valor, String nomeFilme, String lingFilme){
        super();
    }

    @Override
    public double getValorReal(){
        return getValor() / 2;
    }

}
