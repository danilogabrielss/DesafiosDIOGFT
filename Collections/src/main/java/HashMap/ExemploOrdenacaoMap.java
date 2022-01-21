package HashMap;

import java.util.*;

class Livro {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro that = (Livro) o;
        return nome.equals(that.nome) && paginas.equals(that.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }
}

class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        Map<String, Livro> meuslivros = new HashMap<>() {{
            put("Stephen Hawking", new Livro("Uma breve historia", 480));
            put("Cristina Cairo", new Livro("Linguagem do corpo", 300));
            put("Charles Duhigg", new Livro("O poder do habito", 240));
        }};
        System.out.println("Ordem aleatoria");
        for (Map.Entry<String, Livro> livro : meuslivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        Map<String, Livro> livros1 = new LinkedHashMap<>() {{
            put("Stephen Hawking", new Livro("Uma breve historia", 480));
            put("Cristina Cairo", new Livro("Linguagem do corpo", 300));
            put("Charles Duhigg", new Livro("O poder do habito", 240));
        }};
        System.out.println("Ordem de insercao");
        for (Map.Entry<String, Livro> livro : livros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("Ordem alfabetica pelo autor");
        Map<String, Livro> livros2 = new TreeMap<>(livros1);
        for (Map.Entry<String, Livro> livro : livros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("Livros em ordem alfabetica ");
        Set<Map.Entry<String,Livro>> livros3 = new TreeSet<>(new ComparatorNome());
        livros3.addAll(meuslivros.entrySet());
        for (Map.Entry<String, Livro> livro : livros3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("Ordenar pela quantidade de paginas");
        Set<Map.Entry<String,Livro>> livros4 = new TreeSet<>(new ComparatorNumero());
        livros4.addAll(meuslivros.entrySet());
        for (Map.Entry<String, Livro> livro : livros4) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() +
                    "qtd pag "+ livro.getValue().getPaginas());
        }
    }
}
class ComparatorNome implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String,Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareTo(l2.getValue().getNome());
    }

}
class ComparatorNumero implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String,Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }

}
