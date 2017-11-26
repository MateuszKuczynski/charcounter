import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputStream is = Main.class.getResourceAsStream("wordlist.txt");

        Scanner scanner = new Scanner(is);

        StringBuilder lines = new StringBuilder();
        while (scanner.hasNext()) {
            lines.append(scanner.nextLine().toLowerCase());
        }

        Map<Character, Integer> chars = new HashMap<>();

        /*for(char c : line.toCharArray()) {
            if(chars.containsKey(c)) {
                int count = chars.get(c);
                chars.put(c, count + 1);
            } else {
                chars.put(c, 1);
            }
        }*/

        for(char c : lines.toString().toCharArray()) {
            int count = 1;
            if(chars.containsKey(c)) {
                count += chars.get(c);
            }

            chars.put(c, count);
        }

        chars.forEach((c, i) -> System.out.println(c + ": " + i));
    }
}
