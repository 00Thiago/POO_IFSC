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
    public String obterDesenho(){  // para impressão
        String linha = "";
        if (isAberta()){
            while (nivelTinta >= 10) {
                while (definirDesenho >= 10) {
                    linha = linha + "-";
                    definirDesenho = (definirDesenho-10);
                }
                nivelTinta = (nivelTinta-10);
            } 
        }
        return linha;
        
        //TODO implementar lógica
            // if aberta
            // quantos "-" eu consigo desenhar (cálculo)
            // debitar o quantos da tinta
            // return "-".repeat(quantos)
            // while nivelTinta >= 10
            
            // public String desenhar()
            // traco = desenho.repeat((definirDesenho))
    } 

}

//OUTROS PADRÕES:
    //int, byte, short, long: 0
    //float, double: 0.0
    //char: '\u0000'
    //Objetos (incluindo String): null
