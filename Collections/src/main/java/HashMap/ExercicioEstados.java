package HashMap;

import java.util.*;

public class ExercicioEstados {
    public static void main(String[] args) {
        Map<String, Double> estados = new HashMap<>() {{
            put("PE", 9616621d);
            put("AL", 3351543d);
            put("CE", 9187103d);
            put("RN", 3534265d);
        }};
        System.out.println("Sustituir popullacao do RN ");
        estados.put("RN", 3534165d);

        System.out.print("Conferir se o estado de PB esta ");
        boolean pb = estados.containsValue("PB");
        if (pb) {
            System.out.println("true");
        } else {
            System.out.println("false");
            estados.put("PB", 4039277d);
            System.out.println("Estado de PB foi adicionado");
        }
        System.out.print("Populacao de PE é ");
        for (Map.Entry<String, Double> estado : estados.entrySet()) {
            if (estado.getKey().equals("PE")) {
                System.out.println(estado.getValue());
            }
        }
        Map<String, Double> estados1 = new LinkedHashMap<>() {{
            put("PE", 9616621d);
            put("AL", 3351543d);
            put("CE", 9187103d);
            put("RN", 3534265d);
        }};

        System.out.println("Todos estados na ordem de insercao");
        for (Map.Entry<String, Double> estado : estados1.entrySet()) {
            System.out.println("Sigla do estado " + estado.getKey()
                    + " e sua populacao " + estado.getValue());
        }

        System.out.print("Estado com menor populacao é ");
        Double menorPop = Collections.min(estados1.values());
        String estadoMenorPop = "";
        Set<Map.Entry<String, Double>> estados2 = new HashSet<>(estados.entrySet());
        for (Map.Entry<String, Double> es : estados2) {
            if (es.getValue().equals(menorPop))
                estadoMenorPop = es.getKey();
        }
        System.out.println(estadoMenorPop + " e sua populacao de " + menorPop);


        System.out.print("Estado com maior populacao é ");
        Double maiorPop = Collections.max(estados1.values());
        String estadoMaiorPop = "";
        Set<Map.Entry<String, Double>> estados3 = new HashSet<>(estados.entrySet());
        for (Map.Entry<String, Double> estado : estados3) {
            if (estado.getValue().equals(maiorPop))
                estadoMaiorPop = estado.getKey();
        }
        System.out.println(estadoMaiorPop + " e sua populacao de " + maiorPop);

        System.out.print("A soma da populacao dos estados é ");
        Double soma = 0d;
        for (Map.Entry<String, Double> estado : estados3)
            soma += estado.getValue();
        System.out.println(soma);

        Double media = soma / estados3.size();
        System.out.println("A media de populacao dos estados é " + media);

        System.out.println("Remover estado com populacao menor que 4.000.000 ");
        System.out.println(estados3.removeIf(est -> est.getValue() < 40000000d));

        System.out.println("Remova todo os estados");
        estados3.clear();

        System.out.println("Todos os estados estao vazios " +estados3.isEmpty());
    }
}

class ComparatorNomeEst implements Comparator<Map.Entry<String, Double>> {

    @Override
    public int compare(Map.Entry<String, Double> e1, Map.Entry<String, Double> e2) {
        return e1.getKey().compareTo(e2.getKey());
    }
}

class ComparatorNumeroEst implements Comparator<Map.Entry<String, Double>> {

    @Override
    public int compare(Map.Entry<String, Double> e1, Map.Entry<String, Double> e2) {
        return e1.getValue().compareTo(e2.getValue());
    }
}
