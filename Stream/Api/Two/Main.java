package Stream.Api.Two;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//задача создать лист с повторяющимися значениями и вывести количество их повторений

public class Main {

    public static void main(String[] args) {
        List<String> pib = new ArrayList<>();

        pib.add("Antonov");
        pib.add("Popov");
        pib.add("Zobov");
        pib.add("Portos");
        pib.add("Aramis");
        pib.add("Zyev");
        pib.add("Kotov");
        pib.add("Portos");
        pib.add("Aramis");
        pib.add("Zyev");
        pib.add("Kotov");
        pib.add("Antonov");
        pib.add("Popov");
        pib.add("Zobov");
        pib.add("Portos");
        pib.add("Aramis");
        pib.add("Zyev");
        pib.add("Kotov");
        pib.add("Portos");
        pib.add("Aramis");
        pib.add("Pantov");

        System.out.println(pib);
        Map<String,Long> countOfSurname = pib.stream().collect(Collectors.groupingBy(surname->surname, Collectors.counting()));
        System.out.println(countOfSurname);

}
}
