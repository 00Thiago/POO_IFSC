package ads.poo;
public class Contador {

    private int valorAtual;


    // atribuir valor ao contador
    public void getValor(int valorCont) {
        valorAtual = valorCont;
    }

    // incrementar 1 ao valor do contador
    public void incrementar() {
        valorAtual = valorAtual+1;
    }

    // obter o valor atual do contador

    public int mostrarValor() {
        return valorAtual;
    }
         

}
