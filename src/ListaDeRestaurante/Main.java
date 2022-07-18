package ListaDeRestaurante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cardapio rest1 = new Cardapio();
        int respostas = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("========GERENCIADOR RESTAURANTE========");
        System.out.println("Deseja adicionar algum prato ao seu menu? 1-sim 2-não");
        respostas = input.nextInt();

        if (respostas == 1) {
            do {
                rest1.adicionarPratos();
                System.out.println("Deseja adicionar algo mais? 1-sim 2-não");
                respostas = input.nextInt();
            } while (respostas == 1);
            System.out.println("Deseja remover algum item do menu? 1-sim 2-não");
            respostas = input.nextInt();
            if (respostas == 1) {
                do {
                    rest1.removerPratos();
                    System.out.println("Deseja remover mais algum item? 1-sim 2-não");
                    respostas = input.nextInt();
                } while (respostas == 1);
                rest1.exibirPratos();
                System.out.println("Obrigado por usar nosso sistema!");
            }
        } else {
            System.out.println("Até mais!");
        }
    }
}
