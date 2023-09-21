import java.util.*;


public class Main {
    public static void main(String[] args) {
        Map<Integer, String> phoneBook = new HashMap<>();

        phoneBook.put(1230001, "Ivanov");
        phoneBook.put(1230003, "Ivanov");
        phoneBook.put(2230021, "Petrov");
        phoneBook.put(3230035, "Васильев");
        phoneBook.put(3230031, "Васильев");

        Map<String, List<Integer>> cont = new TreeMap<>();
        List<Integer> numb = new ArrayList<>();
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("Введите фамилию: ");
            String zapros = console.nextLine().toLowerCase();
//            String zapros = "Ivanov".toLowerCase();


            for (var item : phoneBook.entrySet()) {
                if (item.getValue().toLowerCase().equals(zapros)){
                    numb.add(item.getKey());
                    cont.put(item.getValue(), numb);
                    Collections.sort(numb);
                }

            }
        }
        System.out.println(cont);
    }
}
