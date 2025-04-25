// Modele um personagem de um jogo de aventura
// Quais são os atributos e métodos essenciais para esse personagem?
// Implemente uma classe Java para representar esse personagem
// Crie uma outra classe com o método main e instancie um objeto da classe Personagem


package ads.poo;

public class Personagem {

    private String arma;
    private int energia;
    private String tipo;


    // MÉTODO

    public void atirar(String tipoArma) {
        arma = tipoArma;
    }


}
