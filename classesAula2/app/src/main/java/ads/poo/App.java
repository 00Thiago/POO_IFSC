package ads.poo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Contador cont = new Contador();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor inicial do contador: ");
        cont.getValor(entrada.nextInt());

        System.out.println("Valor inicial: " + cont.mostrarValor());

        cont.incrementar(0);

        System.out.println("Valor atual: " + cont.mostrarValor());
    }
}
