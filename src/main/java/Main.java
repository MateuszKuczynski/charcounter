import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine().toLowerCase();

        Map<Character, Integer> chars = new HashMap<>();

        /*for(char c : line.toCharArray()) {
            if(chars.containsKey(c)) {
                int count = chars.get(c);
                chars.put(c, count + 1);
            } else {
                chars.put(c, 1);
            }
        }*/

        for(char c : line.toCharArray()) {
            int count = 1;
            if(chars.containsKey(c)) {
                count += chars.get(c);
            }

            chars.put(c, count);
        }

        chars.forEach((c, i) -> System.out.println(c + ": " + i));
    }
}
