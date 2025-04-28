package ads.poo;

import java.util.Scanner;

public class AppPersonagem {
    public static void main(String[] args){
    
        Personagem personagem = new Personagem();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número de seu persinagem: \n 1, 2 ou 3");
        personagem.selecao(scanner.nextInt());

        System.out.println("As características de seu personagem são:\n" + personagem.opcao());








    }
}
