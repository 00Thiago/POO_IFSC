package ads.poo;

class Caneta { // classe é um tipo, tem outros: enum, interface...

    // ATRIBUTOS (ou características)
    private String cor;
    private double nivelTinta;
    private boolean aberta;
    private int definirDesenho;

    // se não tiver dentro de método, é atributo
    
    // MÉTODOS (ou comportamentoS)
    public void definirCor(String nomeCor){ // "portão" de entrada por App.java
        cor = nomeCor; // Estado é o valor atual do atributo. Parâmetro é o valor informado para o método
    }
    public String obterCor(){ // "portão" de saída/impressão pelo App.java
        return cor; // Estado alterado pelo parâmetro branco
    }


    public void definirNivelTinta(double numNivel){ // entrada pelo App
        nivelTinta = ((numNivel >= 0) && (numNivel <= 100)? numNivel: -1);
    }
    public double obterNivelTinta(){ // para impressão
        return nivelTinta;
    } // tem que ter um get e um set tbm pra poder alterar a lógica interna da classe sem ter que alterar a classe cliente


    public void abrirFechar(){ // inverte o booblean (padrão é FALSE)
        aberta = !aberta;
    }
    public boolean isAberta(){ // para impressão
        return aberta;
    }


    public void tamanhoDesenho(int numTamanho){ // entrada pelo App
        definirDesenho = numTamanho;
    }
   
    /*public String obterDesenho(){  // para impressão
        String linha = ""; // OU declara "-" para que em .repeat escreva o nome da variável ao inves de "-"
        String erro = "Não foi possíve desenhar";
        if (isAberta() && nivelTinta >= 10 && definirDesenho >= 10){
            if (nivelTinta >= definirDesenho) {
                while (definirDesenho >= 10) {
                    linha = linha + "-";
                    definirDesenho = (definirDesenho-10);
                }
            } else {
                while (nivelTinta >= 10) {
                    linha = linha + "-";
                    nivelTinta = (nivelTinta-10);
                }
            }   
        } else {
            return erro;
        }
        return linha; 
    } */

public String obterDesenho(){  // para impressão
        String linha = "";
        String erro = "Não foi possíve desenhar";
        int cont = 0;

        if (isAberta() && nivelTinta >= 10 && definirDesenho >= 10){
            if (nivelTinta >= definirDesenho) {
                while (definirDesenho >= 10) {
                    cont++;
                    definirDesenho = (definirDesenho-10);
                }
            } else {
                while (nivelTinta >= 10) {
                    cont++;
                    nivelTinta = (nivelTinta-10);
                }
            }
            linha = "-".repeat(cont);
        } else {
            return erro;
        }
        return linha;

    }
}
/*
OUTROS PADRÕES:
    int, byte, short, long: 0
    float, double: 0.0
    char: '\u0000'
    Objetos (incluindo String): null
*/