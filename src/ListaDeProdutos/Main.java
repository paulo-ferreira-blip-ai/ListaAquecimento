package ListaDeProdutos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto mercado1 = new Produto();
        int respostas = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("========== GERENCIADOR DE PRODUTOS ==========");
        System.out.println("Deseja adicionar algum produto? 1-sim 2-não");
        respostas = input.nextInt();

        if (respostas == 1) {
            do {
                mercado1.adicionarItem();
                System.out.println("Deseja adicionar mais algum produto? 1-sim 2-não");
                respostas = input.nextInt();
            } while (respostas == 1);

            System.out.println("Deseja remover algum produto? 1-sim 2-não");
            respostas = input.nextInt();

            if (respostas == 1) {
                do {
                    mercado1.removerProdutos();
                    System.out.println("Deseja remover mais algum produto? 1-sim 2-não");
                    respostas = input.nextInt();
                } while (respostas == 1);
            }
            mercado1.mostrarProdutos();
            System.out.println("Obrigado por usar nosso sistema.");
        } else {
            System.out.println("Até mais!");
        }
    }
}
