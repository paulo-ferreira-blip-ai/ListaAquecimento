package ListaDeCandidatos;

import ListaDeProdutos.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Candidatos escola1 = new Candidatos();
        int respostas = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("========== GERENCIADOR DE CANDIDATOS ==========");
        System.out.println("Deseja adicionar algum candidato? 1-sim 2-não");
        respostas = input.nextInt();

        if (respostas == 1) {
            do {
                escola1.adicionarCandidato();
                System.out.println("Deseja adicionar mais algum cadidato? 1-sim 2-não");
                respostas = input.nextInt();
            } while (respostas == 1);

            System.out.println("Deseja remover algum cadidato? 1-sim 2-não");
            respostas = input.nextInt();

            if (respostas == 1) {
                do {
                    escola1.removerCandidato();
                    System.out.println("Deseja remover mais algum candidato? 1-sim 2-não");
                    respostas = input.nextInt();
                } while (respostas == 1);
            }
            escola1.mostrarCandidadtos();
            System.out.println("Obrigado por usar nosso sistema.");
        } else {
            System.out.println("Até mais!");
        }
    }

}
