package edu.kelton.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class TesteOrdençaoList{
    public static void main(String[] args) {

        List <Gato> Gatos = new ArrayList<>(){{
            add(new Gato("Miau", 5, "Amarelo"));
            add(new Gato("joao", 6, "Preto"));
            add(new Gato("Miau", 30, "Verde"));
        }};

        System.out.println("--\tOrdem de Inserção\t--");
        System.out.println(Gatos);

        System.out.println("--\tOrdem Aleatória\t--");
        Collections.shuffle(Gatos);
        System.out.println(Gatos);

        System.out.println("--\tOrdem Natural (Nome)\t--");
        Collections.sort(Gatos);
        System.out.println(Gatos);

        System.out.println("--\tOrdem Idade\t--");
        Collections.sort(Gatos, new ComparetorIdade());
        //Gatos.sort(new ComparetorIdade());
        System.out.println(Gatos);

        System.out.println("--\tOrdem Cor\t--");
        Collections.sort(Gatos, new ComparetorCor());
        //Gatos.sort(new ComparetorCor());
        System.out.println(Gatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t--");
        Collections.sort(Gatos, new ComparetorNomeCorIdade());
        //Gatos.sort(new ComparetorNomeCorIdade());
        System.out.println(Gatos);

    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    public String getNome(){
        return nome;
    }
    public Integer getIdade(){
        return idade;
    }
    public String getCor(){
        return cor;
    }
    @Override
    public String toString() {
        return "{" + 
                "nome=" + nome + '\'' + 
                ", idade=" + idade + 
                ", cor='" + cor + '\'' + 
                '}';
    }
    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparetorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparetorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}
class ComparetorNomeCorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}