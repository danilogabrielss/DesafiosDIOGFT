package desafioPoo;

import java.time.LocalDate;

public class Princ {
    public static void main(String[] args) {
        Curso cursoJava = new Curso(80);
        cursoJava.setTitulo("Java 1");
        cursoJava.setDescricao("Java Basico");
        //System.out.println(cursoJava);

        Curso cursoJS = new Curso(60);
        cursoJS.setTitulo("JavaScript 1");
        cursoJS.setDescricao("JavaScript Basico");
        //System.out.println(cursoJS);

        Mentoria mentoria = new Mentoria(LocalDate.now());
        mentoria.setTitulo("Mentoria 1");
        mentoria.setDescricao("1 mentoria do ano");
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp
                ("Bootcamp GFT", "Para estagiario");
        bootcamp.getConteudo().add(cursoJava);
        bootcamp.getConteudo().add(cursoJS);
        bootcamp.getConteudo().add(mentoria);

        Dev dev1 = new Dev("Danilo");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscrito" + dev1.getConteudoInscrito());
        System.out.println("XP do aluno" + dev1.calcularTotalXp());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos Concluido" + dev1.getConteudoConcluido());
        System.out.println("XP do aluno" + dev1.calcularTotalXp());


        //System.out.println("Conteudos inscrito" + dev1.getConteudoInscrito());


        Dev dev2 = new Dev("Gabriel");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscrito" + dev2.getConteudoInscrito());
        System.out.println("XP do aluno" + dev2.calcularTotalXp());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos Concluido" + dev2.getConteudoConcluido());
        System.out.println("XP do aluno" + dev2.calcularTotalXp());

        //System.out.println("Conteudos inscrito" + dev2.getConteudoInscrito());


    }
}
