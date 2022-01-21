package Set;

import java.util.*;

public class LinguagemFavorita {
    private String nome;
    private int anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "Linguagem Favorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagem = new HashSet<LinguagemFavorita>(){{
            add(new LinguagemFavorita("Java",1980 , "Eclipse"));
            add(new LinguagemFavorita("C#",1990,"VS2019"  ));
            add(new LinguagemFavorita("Java Script",2000, "VS Code"));
        }};
        //Ordem de insercao
        for (LinguagemFavorita ling : linguagem ) System.out.println(ling.toString());
        List<LinguagemFavorita> linguagemAlfabetica = new ArrayList<>(linguagem);
        //Collections.sort();
        for(LinguagemFavorita li : linguagemAlfabetica) System.out.println(li.toString());

    }
}
