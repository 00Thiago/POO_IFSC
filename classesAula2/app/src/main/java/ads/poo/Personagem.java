/*PERSONAGEM 1
*jogo de aventura
*Atributos e métodos essenciais para esse personagem
*Crie classe com o método main e instancie um objeto da classe Personagem
*/

package ads.poo;

public class Personagem {

    private String arma;
    private int energia;
    private String tipo;
    private double habilidade;
    private String pais;

    public void selecao(int escolha) {
    int escolhido = escolha;
    }

    public void um() {
        arma = "espada";
        energia = 80;
        tipo = "cavaleiro";
        habilidade = 20.3;
        pais = "Escócia";
    }

    public void dois() {
        arma = "revolver";
        energia = 40;
        tipo = "soldado";
        habilidade = 47.8;
        pais = "Alemanha";
    }

    public void tres() {
        return (
        arma = "tacape";
        energia = 90;
        tipo = "humano";
        habilidade = 32.8;
        pais = "Bósnia";
        )
    }

    // MÉTODO


    public String opcao() {
        if (escolhido == 1) {
            return um();
        } else if (escolhido == 2) {
            return dois();
        } else if (escolhido == 3) {
            return tres();
        } else {
            return (String erro = "Opção não localizada!");
        }
    }


}


