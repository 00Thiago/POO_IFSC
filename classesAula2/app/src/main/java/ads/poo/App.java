package ads.poo;

public class App {
    public static void main(String[] args) {

        Contador contador = new Contador();

        System.out.println(contador.mostrarValor());

        //contador.getValor(2);

        contador.incrementar();

        System.out.println(contador.mostrarValor());



    }
}
