/*PERSONAGEM 1
*jogo de aventura
*Crie atributos e métodos essenciais para esse personagem
*Crie classe com o método main e instancie um objeto da classe Personagem
*/

package ads.poo;

public class Personagem {

    private String arma;
    private int energia;
    private String tipo;
    private double habilidade;
    private String pais;

    private int escolhido;

    public /*String */ void personagem1() {
        arma = "espada";
        energia = 80;
        tipo = "cavaleiro";
        habilidade = 20.3;
        pais = "Escócia";

        System.out.println("[DEBUG] personagem1() foi chamado e valores setados.");
    
        //return ("arma: " + arma + "\nenergia: " + energia + "\ntipo: " + tipo + "\nhabilidade: " + habilidade + "\npaís: " + pais); 
    }

    public /*String*/ void personagem2() {
        arma = "revolver";
        energia = 40;
        tipo = "soldado";
        habilidade = 47.8;
        pais = "Alemanha";
        
        //return ("arma: " + arma + "\nenergia: " + energia + "\ntipo: " + tipo + "\nhabilidade: " + habilidade + "\npaís: " + pais);
        }
    public /*String*/ void personagem3(){
        arma = "tacape";
        energia = 90;
        tipo = "humano";
        habilidade = 32.8;
        pais = "Bósnia";

        //return ("arma: " + arma + "\nenergia: " + energia + "\ntipo: " + tipo + "\nhabilidade: " + habilidade + "\npaís: " + pais); 

    }
/*
    public void getSelecao(int numPersonagem) {
        escolhido = numPersonagem;
    }
*/
    public /*String*/ void selecionaPersonagem(int numPersonagem) {
        escolhido = numPersonagem;
        switch (escolhido) {
            case 1 -> //{
                /*return*/ personagem1();
            //}
            case 2 -> //{
                /*return*/ personagem2();
            //}
            case 3 -> //{
                /*return*/ personagem3();
            //}
            default -> //{ 
                /*return "Opção inválida!"*/ System.out.println("Inválido! Escolha 1, 2 ou 3:");
            //}
        }
    }

    public String getPersonagem() {
        return ("arma: " + arma + "\nenergia: " + energia + "\ntipo: " + tipo + "\nhabilidade: " + habilidade + "\npaís: " + pais);   
    }
}


