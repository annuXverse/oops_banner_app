public class UC7 {
    public static void main(String[] args) {
        // Goal: Use a dedicated class to encapsulate patterns
        CharacterPattern o = new CharacterPattern('O', new String[]{
            "  *** ", " ** **", " ** **", " ** **", " ** **", "  *** "
        });
        CharacterPattern p = new CharacterPattern('P', new String[]{
            " ***** ", " ** **", " ***** ", " ** ", " ** ", " ** "
        });
        CharacterPattern s = new CharacterPattern('S', new String[]{
            "  **** ", " ** ", "  *** ", "    ** ", "    ** ", " **** "
        });

        // Displaying the banner line by line
        for (int i = 0; i < 6; i++) {
            System.out.println(String.join(" ", 
                o.getLine(i), o.getLine(i), p.getLine(i), s.getLine(i)
            ));
        }
    }
}

// Dedicated class for character encapsulation
class CharacterPattern {
    private char character;
    private String[] pattern;

    // Constructor to initialize the object
    public CharacterPattern(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    // Getter method to retrieve a specific line of the pattern
    public String getLine(int index) {
        return pattern[index];
    }
}