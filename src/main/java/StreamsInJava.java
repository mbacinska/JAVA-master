import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsInJava {

  public static void main(String[] args) {

    List<Integer> number = Arrays.asList(3, 5, 2, 1, 7, 4);

    number.stream().map(x -> x + 1).forEach(y -> System.out.println(y));

    System.out.println("=======================================");

    List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());

    System.out.println(square);

    System.out.println("=======================================");

    List<String> names = Arrays.asList("Monika", "Barbara", "Zdzislaw", "Celina", "Bogusaw");

    List<String> filteredNames = names.stream().filter((s -> s.startsWith("B"))).collect(Collectors.toList());

    System.out.println(filteredNames);

    System.out.println("=======================================");

    List<Integer> sortedNumbers = number.stream().sorted().collect(Collectors.toList());

    System.out.println(sortedNumbers);

    System.out.println("=======================================");

  }
}
