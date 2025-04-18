package ads.poo;

public class Caneta {

    // atributos
    private String cor;
    private double nivelTinta;
    private boolean aberta;
    private int desenho;
    

    public void definirCor(String c){
        cor = c;
    }

    public String obterCor(){
        return cor;
    }

    public void definirNivelTinta(double n){
        nivelTinta = ((n >= 0) && (n <= 100)? n: -1);
    }

    public double obterNivelTinta(){
        return nivelTinta;
    }

    public void abrirFechar(){
        aberta = !aberta;
    }

    public boolean isAberta(){
        return aberta;
    }

    public void tamanhoDesenho(int d){
        desenho = d;
    }

    public String desenhar(int quantidade){
        String traco = "";
        if (isAberta()){
            while (nivelTinta >= 10) {
                traco = traco + "-";
                nivelTinta = (nivelTinta-10);
            }
    

        }

        //TODO implementar lógica
        // 1 if aberta
        // 2 quantos - eu consigo desenhar - cálculo
        // 3 debitar o quantos da tinta
        // 4 return "-".repeat(quantos)


        // while nivelTinta >= 10


        return traco;
    } 

}