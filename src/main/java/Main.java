import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Федя","Вася","Коля", "Вася", "Федя","Андрей","Коля",
                "Вова","Петя","Андрей","Никита","Федя"
        );

        Set<String> uniqueNames = new HashSet<>(names);

        System.out.println("Первоначальный массив");
        System.out.println(names);
        System.out.println("Уникальные слова");
        System.out.println(uniqueNames);

        }
    }
