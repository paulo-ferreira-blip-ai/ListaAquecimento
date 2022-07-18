package ListaDeProdutos;

import java.util.HashMap;
import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private String resposta;
    int qtdProdutos = 0;
    private HashMap<String, Double> listaDeProdutos = new HashMap<String, Double>();

    public Produto(String nome, double preco, String resposta, int qtdProdutos, HashMap<String, Double> listaDeProdutos) {
        this.nome = nome;
        this.preco = preco;
        this.resposta = resposta;
        this.qtdProdutos = qtdProdutos;
        this.listaDeProdutos = listaDeProdutos;
    }

    public Produto() {
    }

    //métodos
    public void adicionarItem() {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos produtos você quer adicionar? ");
        qtdProdutos = input.nextInt();

        for (int i = 0; i < qtdProdutos; i++) {
            //Produto p1 = new Produto();

            System.out.println("Adicione o nome do " + (i + 1) + "º produto:  ");
            this.nome = input.next();
            System.out.println("Adicione o preço do " + (i + 1) + "º produto:  ");
            this.preco = input.nextDouble();
            listaDeProdutos.put(getNome(), getPreco());
        }
    }

    public void removerProdutos() {
        System.out.println("Produtos Adicionados: " + listaDeProdutos);

        System.out.println("\nQuantos produtos desejar remover?");
        Scanner input2 = new Scanner(System.in);
        qtdProdutos = input2.nextInt();

        for (int i = 0; i < qtdProdutos; i++) {
            System.out.println("Adicione o nome do " + (i + 1) + "º produto:  ");
            resposta = input2.next();
            listaDeProdutos.remove(resposta);
        }
    }

    public void mostrarProdutos() {
        System.out.println("Produtos após remoções: " + listaDeProdutos);

    }

    //Metodos toString que tranforma os dados do vetor em Strings para serem mostradas:
    public String toString() {

        return this.nome + ": R$" + this.preco;
    }

    //Métodos Especiais:
    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public double getPreco() {

        return preco;
    }

    public void setPreco(double preco) {

        this.preco = preco;
    }

    public String getResposta() {

        return resposta;
    }

    public void setResposta(String resposta) {

        this.resposta = resposta;
    }

    public int getQtdProdutos() {

        return qtdProdutos;
    }

    public void setQtdProdutos(int qtdProdutos) {

        this.qtdProdutos = qtdProdutos;
    }

    public HashMap<String, Double> getListaDeProdutos() {

        return listaDeProdutos;
    }

    public void setListaDeProdutos(HashMap<String, Double> listaDeProdutos) {

        this.listaDeProdutos = listaDeProdutos;
    }
}
