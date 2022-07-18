package ListaDeRestaurante;

import java.util.*;

public class Cardapio {
    private String nomePrato;
    private HashMap<String, String> pratos = new HashMap<String, String>();
    int respostasNum;
    int qtdPratos;

    //métodos
    public void adicionarPratos() {
        System.out.println("Quantos pratos deseja adicionar? ");
        Scanner input = new Scanner(System.in);
        qtdPratos = input.nextInt();

        for (int i = 0; i < qtdPratos; i++) {
            List<String> ingredientes = new ArrayList<String>();
            System.out.println("Nome do " + (i + 1) + "º prato: ");
            this.nomePrato = input.next();
            System.out.println("Quantos ingredientes há nesse prato? ");
            qtdPratos = input.nextInt();
            for (int j = 0; j < qtdPratos; j++) {
                System.out.println("Ingrediente " + (j + 1) + " do " + (i + 1) + "º prato: ");
                ingredientes.add(input.next());
                for (String c : pratos.values()) {
                    System.out.println(c);
                }
            }
            pratos.put(getNomePrato(), String.valueOf(ingredientes));
        }
    }
    public void removerPratos() {
        System.out.println("Pratos adicionados: " + pratos);
        System.out.println("Quantos pratos deseja remover? ");
        Scanner input2 = new Scanner(System.in);
        qtdPratos = input2.nextInt();

        for (int i = 0; i < qtdPratos; i++) {
            System.out.println("Informe o nome do " + (i + 1) + "º prato: ");
            nomePrato = input2.next();
            pratos.remove(nomePrato);
        }

    }

    public void exibirPratos() {
        System.out.println("Pratos disponíveis após remoções: " + pratos);

    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }


    public HashMap<String, String> getPratos() {
        return pratos;
    }

    public void setPratos(HashMap<String, String> pratos) {
        this.pratos = pratos;
    }

    public int getRespostasNum() {
        return respostasNum;
    }

    public void setRespostasNum(int respostasNum) {
        this.respostasNum = respostasNum;
    }

    public int getQtdPratos() {
        return qtdPratos;
    }

    public void setQtdPratos(int qtdPratos) {
        this.qtdPratos = qtdPratos;
    }
}
