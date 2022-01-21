package desafioPoo;

public abstract class Conteudo {
    public static final double  XP_PADRAO = 10;

    private String titulo;
    private String descricao;

    public abstract double calcuarXP();

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
