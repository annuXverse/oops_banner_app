import java.util.HashMap;
import java.util.Map;

public class UC8 {
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
          patternMap.put('O', new String[]{
            "  ***  ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  ***  "
        });

        patternMap.put('P', new String[]{
            " **** ",
            " *  * ",
            " **** ",
            " *    ",
            " *    "
        });

        patternMap.put('S', new String[]{
            "  **** ",
            " *     ",
            "  ***  ",
            "     * ",
            " ****  "
        });
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }

    public static void renderBanner(String word) {
        word = word.toUpperCase();
        for (int i = 0; i < 5; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                if (patternMap.containsKey(c)) {
                    line.append(patternMap.get(c)[i]).append(" ");
                }
            }
            System.out.println(line);
        }
    }
}
