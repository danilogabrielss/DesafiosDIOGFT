package Set;

import java.util.*;

public class ExemploSet {
    public static void main (String [] args){
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.6,9.3,5d,7d,0d,3.6));
        System.out.println(notas.toString());

        System.out.println("Conferir se tem a nota 5.0 no conjunto: " + notas.contains(5d));

        System.out.println("A menor nota é " + Collections.min(notas));
        System.out.println("A maior nota é " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exibir a soma dos valores: "+ soma);

        System.out.println("Exibir a media dos valores: " + soma/notas.size());

        System.out.println("Remova a nota 0:  " );
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova valores abaixo de 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        Set<Double> notas2 = new LinkedHashSet<Double>();
        notas2.add(7d);
        notas2.add(8.6);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");

        System.out.println("O conjunto notas esta vazio "+notas.isEmpty());


    }
}
