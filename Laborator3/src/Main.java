import java.util.*;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] main) {
        System.out.print("String to convert: ");
        String text = scanner.nextLine();

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        StringTokenizer stringTokenizer = new StringTokenizer(text, " ,.;!?");

        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken().toLowerCase(Locale.ROOT);

            if (!treeMap.containsKey(token)) {
                treeMap.put(token, 1);
            } else {
                treeMap.replace(token, treeMap.get(token)+1);
            }
        }

        for(Map.Entry<String, Integer> e : treeMap.entrySet()){
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}
