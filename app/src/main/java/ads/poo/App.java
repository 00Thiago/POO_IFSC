package ads.poo;

public class App {
    public static void main(String[] args) {

    Caneta bic = new Caneta();

    System.out.println(bic.isAberta());

    bic.abrirFechar();

    bic.definirCor("branco");

    bic.definirNivelTinta(80);

    bic.tamanhoDesenho(50);


    System.out.println(bic.isAberta());
    System.out.println(bic.obterCor());
    System.out.println(bic.obterNivelTinta());
    System.out.println(bic.desenhar(5));


    }
}
