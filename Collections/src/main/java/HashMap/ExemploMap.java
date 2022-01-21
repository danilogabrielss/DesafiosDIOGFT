package HashMap;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionario que relaciona os modelos e consumo de carro");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol",14.4);
            put("Onix",12.1);
            put("Polo",11.4);
            put("Fiesta",11.9);
            put("Palio",14.9);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substituindo o consumo do gol para 15.6 km/l");
        carrosPopulares.put("Gol", 15.6);
        System.out.println(carrosPopulares.toString());

        System.out.println("O carro Tucson esta na lista? " + carrosPopulares.containsKey("Tucson"));

        System.out.println("O consumo do Onix é "+carrosPopulares.get("Onix"));

        System.out.println("Mostre modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Mostre consumo dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        Double consumoEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String,Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String,Double> entry : entries){
            if( entry.getValue().equals(consumoEficiente))
                modeloMaisEficiente = entry.getKey();
        }
        System.out.println("Modelo mais economico é " +modeloMaisEficiente +" seu consumo é "+ consumoEficiente);

        //Modelo menos economico
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String,Double> entry : carrosPopulares.entrySet()){
            if(entry.getValue().equals(consumoMenosEficiente))
                modeloMenosEficiente = entry.getKey();
        }
        System.out.println("Modelo menos eficiente é " + modeloMenosEficiente
                + " e o consumo é " + consumoMenosEficiente);

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double somaMedia = 0d;
        while (iterator.hasNext()){
            somaMedia += iterator.next();
        }
        System.out.println("A soma das média é " + somaMedia);

        System.out.println("A média dos carros são " + (somaMedia / carrosPopulares.size()));

        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next().equals(11.9d))
                iterator1.remove();
        }
        System.out.println(carrosPopulares);

        Map<String,Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("Gol",14.4);
            put("Onix",12.1);
            put("Polo",11.4);
            put("Fiesta",11.9);
            put("Palio",14.9);
        }};
        System.out.println(carrosPopulares1);

        Map<String,Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);

        carrosPopulares.clear();
        System.out.println( "A lista de carros esta vazia "+ carrosPopulares.isEmpty());
    }
}
