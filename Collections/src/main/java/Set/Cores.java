package Set;

import java.util.*;

public class Cores  {
    private String cor;

    public Cores(String cor) {
        this.cor = cor;
    }
    @Override
    public String toString() {
        return "{" +
                "cor='" + cor + '\'' +
                '}';
    }
    public String getCor() {
        return cor;
    }

    public static void main(String[] args) {
        //Topico A
        Set<String> cores = new LinkedHashSet<String>(){{
            add("Vermelha");
            add("Laranja");
            add("Amarela");
            add("Verde");
            add("Azul");
            add("Azul-escuro");
            add("Violeta");
        }};
        for(String cor : cores) System.out.println(cor.toString());
        //Topico B
        System.out.println("A quantidade de cores que o arco-iris possui é " + cores.size());
        //TOpico C
        System.out.println("-----------------------");
        System.out.println("Lista Ordem alfabetica");
        List<String> coresOrdenada = new ArrayList<>(cores);
        Collections.sort(coresOrdenada);
        for(String cor : coresOrdenada) System.out.println(cor.toString());
        //Topico D
        System.out.println("-----------------------");
        System.out.println("Lista Ordem alfabetica inversa");
        Collections.sort(coresOrdenada, Collections.reverseOrder());
        for(String cor : coresOrdenada) System.out.println(cor.toString());
        //Topico E
        System.out.println("-----------------------");
        System.out.println("Set.Cores iniciadas por V");
        for (String cor : cores){
            if (cor.startsWith("V")) System.out.println(cor.toString());
        }
        //Topico F
        System.out.println("-----------------------");
        System.out.println("Remover todas as cores com V");
        cores.removeIf(cor -> cor.startsWith("V"));
        for (String cor : cores) System.out.println(cor.toString());
        //Topico G
        cores.clear();
        //Topico H
        //cores.add("verde");
        if(cores.isEmpty()) System.out.println("A lista esta vazia");
        else System.out.println("A lista tem cores ainda");
    }
}



