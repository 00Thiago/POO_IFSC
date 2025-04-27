package ads.poo;

class Caneta { // classe é um tipo, tem outros: enum, interface...

    // ATRIBUTOS (ou características)
    private String cor;
    private double nivelTinta;
    private boolean aberta;
    private int definirDesenho;

    // se não tiver dentro de método, é atributo
    
    // MÉTODOS (ou comportamentoS)

    public void definirCor(String nomeCor){ // "portão" para o parâmtro que entrará pelo App.java. Parâmetro é o valor informado para o método
        cor = nomeCor; // estado é o parâmetro/valor atual do atributo (Ex.: Branco). 
    }
    public String obterCor(){ // "portão" de saída/impressão para o App.java
        return cor; // informa o estado atual que foi alterado pelo parâmetro branco. Inutil aqui, mas seria util se houvesse condicional
    }


    public void definirNivelTinta(double numNivel){ // entrada pelo App

        nivelTinta = ((numNivel >= 0) && (numNivel <= 100)? numNivel: -1); // condicional para verificar se o nivel de tinta informado pelo App está entre 0 e 100%, se não estiver atribui o estado -1 ("erro")
    }
    public double obterNivelTinta(){ // para impressão pelo App
        return nivelTinta; // tem sempre que ter os métodos get (definir) e um set (obter) tbm pra poder alterar a lógica dentro da classe sem ter que alterar a classe cliente (App)
    } 


    public void abrirFechar(){ 
        aberta = !aberta;  // inverte o booblean (padrão é FALSE)
    }
    public boolean isAberta(){ // para impressão
        return aberta;
    }

    public void tamanhoDesenho(int numTamanho){ // entrada pelo App
        definirDesenho = numTamanho;
    }

    public int numTamDesenho() {
        return definirDesenho;
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
        String linha;
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
