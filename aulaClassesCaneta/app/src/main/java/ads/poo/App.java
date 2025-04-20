package ads.poo;

public class App {
    public static void main(String[] args) {

    Caneta bic = new Caneta();
    
    System.out.println(bic.isAberta());
    bic.abrirFechar();
    System.out.println(bic.isAberta());
    

    bic.definirCor("branco");
    System.out.println(bic.obterCor());
    

    bic.definirNivelTinta(80);
    System.out.println(bic.obterNivelTinta());
    
    
    bic.tamanhoDesenho(50);
    System.out.println(bic.obterDesenho());
    }
}
