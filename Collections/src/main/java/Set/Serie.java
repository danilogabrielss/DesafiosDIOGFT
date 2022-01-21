package Set;

import java.util.*;

class ExemploOrdenacaoSet{
    public static void main(String[] args) {
        System.out.println("Ordem aleatoria");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("arrow", "acao", 42));
            add(new Serie("dark","suspense", 60 ));
            add(new Serie("flash","drama", 42 ));
        }};
        for (Serie se : minhasSeries){
            System.out.println(se.toString());
        }
        System.out.println("Ordem insercao");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("arrow", "acao", 42));
            add(new Serie("dark","suspense", 60 ));
            add(new Serie("flash","drama", 42 ));
        }};
        for (Serie se : minhasSeries1){
            System.out.println(se.toString());
        }
        System.out.println("Ordem natural");
        Set<Serie> minhasSeries2 = new TreeSet<>(){{
            add(new Serie("arrow", "acao", 42));
            add(new Serie("dark","suspense", 60 ));
            add(new Serie("flash","drama", 42 ));
        }};
        for (Serie se : minhasSeries2){
            System.out.println(se.toString());
        }

    }
}

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public int compareTo(Serie serie) {
        int compare = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if(tempoEpisodio !=0){
            return tempoEpisodio;
        }
        return this.getGenero().compareTo(serie.getGenero());
    }
}
/*class ComparatoNomeGeneroTempoEpisodio implements Comparator<Set.Serie>{
    @Override
    public int compare(Set.Serie s1, Set.Serie s2) {
        int compare = Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
        if(tempoEpisodio !=0){
            return tempoEpisodio;
        }
        return this.getGenero().compareTo(serie.getGenero());
    }
}*/
