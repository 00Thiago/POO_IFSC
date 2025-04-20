package ads.poo;

public class Caneta {

    // atributos
    private String cor;
    private double nivelTinta;
    private boolean aberta;
    private int definirDesenho;
    
    // métodos
    public void definirCor(String nomeCor){ // entrada por App.java
        cor = nomeCor;
    }
    public String obterCor(){ // para impressão pelo App.java
        return cor;
    }


    public void definirNivelTinta(double numNivel){ // entrada pelo App
        nivelTinta = ((numNivel >= 0) && (numNivel <= 100)? numNivel: -1);
    }
    public double obterNivelTinta(){ // para impressão
        return nivelTinta;
    }


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
            // traco = desenho.repeat((tInformado/10))
    } 

}