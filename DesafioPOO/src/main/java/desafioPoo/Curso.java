package desafioPoo;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso() { }

    public Curso(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public java.lang.String toString() {
        return "Curso{" +
                "titulo='" + super.getTitulo() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcuarXP() {
        return XP_PADRAO + cargaHoraria;
    }
}