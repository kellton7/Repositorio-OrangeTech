package edu.kelton.CollectionFramework;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class TesteOrdenacaoSet{
    public static void main(String[] args) {

        System.out.println("--\tOrdem Aleatória\t--");

        Set<Serie> minhaSerie = new HashSet<>(){{

            add(new Serie("got", "Fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("sei la", "comedia", 300));
        }};
        for(Serie serie: minhaSerie) System.out.println(serie.getnome() + " - " + serie.getgenero() + " - " + serie.getTempoEp());

        System.out.println("--\tOrdem de Inserção\t--");
        Set<Serie> minhaSerie1 = new HashSet<>(){{

            add(new Serie("got", "Fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("sei la", "comedia", 300));
        }};
        for(Serie serie: minhaSerie1) System.out.println(serie.getnome() + " - " + serie.getgenero() + " - " + serie.getTempoEp());
        
        System.out.println("--\tOrdem Natural (Tempo)\t--");
        Set<Serie> minhaSerie2 = new TreeSet<>(minhaSerie1);
        for(Serie serie: minhaSerie2) System.out.println(serie.getnome() + " - " + serie.getgenero() + " - " + serie.getTempoEp());

        System.out.println("--\tOrdem Nome/Genero/tempo\t--");
        Set<Serie> minhaSerie3 = new TreeSet<>(new CompartorNomeGeneroTempo());
        minhaSerie3.addAll(minhaSerie);
        for(Serie serie: minhaSerie3) System.out.println(serie.getnome() + " - " + serie.getgenero() + " - " + serie.getTempoEp());

    }
}
class Serie implements Comparable <Serie>{
    private String nome;
    private String genero;
    private Integer tempoEp;

    public Serie(String nome, String genero, Integer tempoEp){
        this.nome = nome;
        this.genero = genero;
        this.tempoEp = tempoEp;
    }

    public String getnome(){
        return nome;
    }
    public String getgenero(){
        return genero;
    }
    public Integer getTempoEp(){
        return tempoEp;
    }
    @Override
    public String toString() {
        return "{" + 
        "nome=" + nome + '\'' + 
        ", genero=" + genero + 
        ", tempoEp='" + tempoEp + '\'' + 
        '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o ) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o; 
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEp.equals(serie.tempoEp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEp);
    }
    @Override
    public int compareTo(Serie serie) {
        int tempoEp = Integer.compare(this.getTempoEp(), serie.getTempoEp());
        if( tempoEp != 0) return tempoEp;
        return this.getgenero().compareTo(serie.getgenero());
    }
}
class CompartorNomeGeneroTempo implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {

        int nome = s1.getnome().compareTo(s2.getnome());
        if( nome != 0) return nome;

        int genero = s1.getgenero().compareTo(s2.getgenero());
        if( genero != 0) return genero;
        return Integer.compare(s1.getTempoEp(), s2.getTempoEp());
    
        
    }
}