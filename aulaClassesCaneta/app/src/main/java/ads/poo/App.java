package ads.poo;

import java.util.Scanner;

class App {
    public static void main(String[] args) {

        Caneta bic = new Caneta(); // Bic é o objeto aqui sendo criado. "New" indica novo objeto
        
        Scanner cor = new Scanner(System.in);
        Scanner nivel = new Scanner(System.in);
        Scanner tamanho = new Scanner(System.in);

        // Perguntas:

        System.out.print("Informe a cor da caneta: ");
        bic.definirCor(cor.nextLine());

        System.out.println("Informe o nível da tinta: ");
        bic.definirNivelTinta(nivel.nextDouble());

        System.out.println ("Informe o tamanho do desenho: ");
        bic.tamanhoDesenho(tamanho.nextInt()); // o num é o estado

        // Respostas:

        System.out.println("A caneta está aberta? " + bic.isAberta());
        bic.abrirFechar();
        System.out.println("Alterando estado...");
        System.out.println("A caneta está aberta? " + bic.isAberta());
        
        System.out.println("A cor é: " + bic.obterCor());
        // Objeto (bic) chama um método (definirCor) e envia uma mensagem (branco).
            // OU  o código cliente (App) envia uma mensagem (chamada de método definirCor) para o objeto (bic) com um parâmetro ("branco").

        System.out.println("O nível de tinta é: " + bic.obterNivelTinta());
        
        System.out.println("O desenho:\n" + bic.obterDesenho());
    }
}
