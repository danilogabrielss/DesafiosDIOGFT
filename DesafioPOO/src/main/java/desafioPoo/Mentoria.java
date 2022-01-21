package desafioPoo;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcuarXP() {
        return xp + 20d;
    }

    public Mentoria() { }

   public Mentoria(LocalDate data) {
        this.data = data;
    }

    @Override
    public String   toString() {
        return "Mentoria{" +
                "titulo='" + super.getTitulo() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
