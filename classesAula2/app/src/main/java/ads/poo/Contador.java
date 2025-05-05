/*CONTADOR
*Único atributo: valorAtual
*Métodos para:
*   Atribuir um valor ao contador
*   Incrementar em 1 o valor do contador
*   Obter o valor atual do contado
*/
package ads.poo;
public class Contador {

    private int valorAtual;

     // obter o valor atual do contador
    public void getValor(int valorCont) {
        valorAtual = valorCont;
    }

    // atribuir valor ao contador
    public int setValor() {
        return valorAtual;
    }

    // incrementar 1 ao valor do contador
    public void incrementar(int incremento) {
        valorAtual = (incremento == 0) ? valorAtual+1 : valorAtual+incremento;
    }
}
