package ads.poo;

class App {
    public static void main(String[] args) {

        Caneta bic = new Caneta(); // Bic é o objeto aqui sendo criado. "New" indica novo objeto
        
        System.out.println(bic.isAberta());
        bic.abrirFechar();
        System.out.println(bic.isAberta());
        

        bic.definirCor("branco");
        System.out.println(bic.obterCor());
        // Objeto (bic) chama um método (definirCor) e envia uma mensagem (branco).
            // OU  o código cliente (App) envia uma mensagem (chamada de método definirCor) para o objeto (bic) com um parâmetro ("branco").

        bic.definirNivelTinta(80);
        System.out.println(bic.obterNivelTinta());
        

        bic.tamanhoDesenho(50); // 50 é o estado
        System.out.println(bic.obterDesenho());
    }
}
