package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "7", "3", "0", "4", "2", "0", "8", "6", "9");
        numerosAleatorios.stream().forEach(System.out::println);

        System.out.println("Pegar os 5 primeiros numeros e colocar dentro de um Set: ");
        Set<String> collect = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());

        System.out.println(collect.toString());

        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList());

        System.out.println(listParesMaioresQue2);

        List<Integer> listInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                //.filter(i -> i % 2 != 0)
                .collect(Collectors.toList());

        numerosAleatorios.stream()
                .mapToInt(s -> Integer.parseInt(s))
                .average()
        .ifPresent(System.out::println);

        System.out.println("Numeros impares presente na lista");
        List<Integer> listImpares = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(listImpares);

        System.out.println("Numeros impares removidos da lista");
        listInteger.removeIf( i -> i % 2 !=0);
        System.out.println(listInteger);
    }
}
