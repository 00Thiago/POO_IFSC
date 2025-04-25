package ads.poo;

class App {
    public static void main(String[] args) {

        Caneta bic = new Caneta(); // Bic é o objeto aqui sendo criado. "New" indica novo objeto
        
        System.out.println(bic.isAberta());
        bic.abrirFechar(); // chama o método abrirFechar definido wm Caneta.java para alterar o estado (valor atual do atributo)
        System.out.println(bic.isAberta());
        

        bic.definirCor("branco"); // informa o valor/estado para variável privada da classe Caneta chamada "cor", pelo método definirCor
        System.out.println(bic.obterCor());
        // Objeto (bic) chama um método (definirCor) e envia uma mensagem (branco).
            // OU  o código cliente (App) envia uma mensagem (chamada de método definirCor) para o objeto (bic) com um parâmetro ("branco").

        bic.definirNivelTinta(80);
        System.out.println(bic.obterNivelTinta());
        

        bic.tamanhoDesenho(50); // 50 é o estado
        System.out.println(bic.obterDesenho());
    }
}
