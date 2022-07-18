package ListaDeCandidatos;

import java.util.HashMap;
import java.util.Scanner;

public class Candidatos {
    private  double nota;
    private int numeroMatricula;
    private int resposta;
    int qtdCadidatos = 0;
    private HashMap<Integer, Double> listaDeCandidatos = new HashMap<Integer, Double>();

    public Candidatos(double nota, int numeroMatricula, int resposta, int qtdProdutos, HashMap<Integer, Double> listaDeProdutos) {
        this.nota = nota;
        this.numeroMatricula = numeroMatricula;
        this.resposta = resposta;
        this.qtdCadidatos = qtdProdutos;
        this.listaDeCandidatos = listaDeProdutos;
    }

    public Candidatos(){

    }

    //métodos
    public void adicionarCandidato() {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos candidatos você quer adicionar? ");
        qtdCadidatos = input.nextInt();

        for (int i = 0; i < qtdCadidatos; i++) {

            System.out.println("Adicione a matrícula do " + (i + 1) + "º candidato:  ");
            this.numeroMatricula = input.nextInt();
            System.out.println("Adicione a nota do " + (i + 1) + "º candidato:  ");
            this.nota = input.nextDouble();
            listaDeCandidatos.put(getNumeroMatricula(), getNota());
        }
    }

    public void removerCandidato() {
        System.out.println("Candidatos Adicionados: " + listaDeCandidatos);
        System.out.println("\nQuantos candidatos desejar remover?");
        Scanner input2 = new Scanner(System.in);
        qtdCadidatos = input2.nextInt();

        for (int i = 0; i < qtdCadidatos; i++) {
            System.out.println("Adicione o número da matricula do " + (i + 1) + "º candidato:  ");
            resposta = input2.nextInt();
            listaDeCandidatos.remove(resposta);
        }
    }
    public void mostrarCandidadtos() {
        System.out.println("Cadidatos após remoções: " + listaDeCandidatos);

    }


    //Métodos Especiais:

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Integer getResposta() {
        return resposta;
    }

    public void setResposta(Integer resposta) {
        this.resposta = resposta;
    }

    public int getQtdProdutos() {
        return qtdCadidatos;
    }

    public void setQtdProdutos(int qtdProdutos) {
        this.qtdCadidatos = qtdProdutos;
    }

    public HashMap<Integer, Double> getListaDeProdutos() {
        return listaDeCandidatos;
    }

    public void setListaDeProdutos(HashMap<Integer, Double> listaDeProdutos) {
        this.listaDeCandidatos = listaDeProdutos;
    }
}
