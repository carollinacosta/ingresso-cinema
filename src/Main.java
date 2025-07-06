import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ingresso ingresso1 = new Ingresso();
        MeiaEntrada ingressoMeia = new MeiaEntrada(15.0,"Como treinar seu dragão", "Dublado");


        System.out.println("***Bem vindo ao Cine Carol***");
        System.out.println("=========================");
        System.out.println("Informações sobre o filme de hoje:");
        ingresso1.setNomeFilme("Como treinar seu dragão");
        ingresso1.setValor(15);
        ingresso1.setLingFilme("Dublado");

        System.out.println("Filme: " + ingresso1.getNomeFilme());
        System.out.println("Valor: " + ingresso1.getValor());
        System.out.println("Linguagem: " + ingresso1.getLingFilme());

        int opcao;

        do {
            System.out.println("Selecione o tipo de ingresso:");
            System.out.println("1- Ingresso tradicional");
            System.out.println("2- Meia entrada");
            System.out.println("3- Ingresso Família");
            System.out.println("0- Sair");
            opcao = scanner.nextInt();


            switch (opcao){
                case 1 -> {
                    System.out.println("Ingresso Tradicional. Valor a pagar: " + ingresso1.getValorReal());
                }
                case 2 -> {
                    System.out.println("Meia Entrada. Valor a pagar: " + ingressoMeia.getValorReal());
                }
                case 3 -> {
                    System.out.println("Informe o número de pessoas:");
                    int qtdPessoas = scanner.nextInt();

                    IngressoFamilia ingressoFamilia = new IngressoFamilia(15.0, "Como treinar seu dragão", "Dublado", qtdPessoas);

                    System.out.println("Ingresso Família. Valor a pagar: R$" + ingressoFamilia.getValorReal());
                }
                case 0 -> System.out.println("Fim de Acesso");
                default -> System.out.println("Opção inválida");

            }
        }while (opcao !=0);

    }
}
