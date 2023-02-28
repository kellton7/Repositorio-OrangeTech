package edu.kelton.CollectionFramework;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Set;

class OrdenacaoMap {
    public static void main(String[] args) {
        
        System.out.println("--\tOrdem aleatoria\t--");
        
        Map<String, Livro> meuslivro = new HashMap<>(){{
            put(" Hawking, Ster", new Livro("Harry Poter", 120));
            put(" Andre, Ster", new Livro("Hello", 124));
            put(" Luis, Dias", new Livro("Historia para dormir", 320));
            put(" Ster, Hankis", new Livro("Aventura na fazenda", 220));
        }};
        for(Map.Entry<String, Livro> livros: meuslivro.entrySet())
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());

        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> meuslivro1 = new LinkedHashMap<>(){{
            put(" Hawking, Ster", new Livro("Harry Poter", 120));
            put(" Andre, Ster", new Livro("Hello", 124));
            put(" Luis, Dias", new Livro("Historia para dormir", 320));
            put(" Ster, Hankis", new Livro("Aventura na fazenda", 220));
        }};
        for(Map.Entry<String, Livro> livros: meuslivro1.entrySet())
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());

        System.out.println("--\tOrdem Alfabética autores\t--");
        Map<String, Livro> meuslivro2 = new TreeMap<>(meuslivro1);
        for(Map.Entry<String, Livro> livros: meuslivro2.entrySet())
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());

        System.out.println("--\tOrdem Alfabética nomes dos livros\t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meuslivro.entrySet());
        System.out.println(meusLivros3);
        for(Map.Entry<String, Livro> livros: meusLivros3)
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
        
        System.out.println("--\tOrdem numero de paginas\t--");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparetorPagina());
        meusLivros4.addAll(meuslivro.entrySet());
        System.out.println(meusLivros4);
        for(Map.Entry<String, Livro> livros: meusLivros4)
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
    }
}
class Livro{
    private String nome;
    private Integer paginas;
    
    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas == null) {
            if (other.paginas != null)
                return false;
        } else if (!paginas.equals(other.paginas))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Livro [nome =" + nome + ", paginas =" + paginas + "]";
    }
}
class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> t1){
        return l1.getValue().getNome().compareToIgnoreCase(t1.getValue().getNome());
    }
}
class ComparetorPagina implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Entry<String, Livro> l2) {
        return l1.getValue().getPaginas().compareToIgnoreCase(l2.getValue().getPaginas());
    }
    
}
