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
