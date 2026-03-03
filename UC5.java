public class UC5 {
    public static void main(String[] args) {
        // UC5 Goal: Combine declaration and initialization in one statement
        String[] banner = {
            String.join(" ", "  *** ", "  ***  ", " ***** ", "  **** "),
            String.join(" ", " ** **", " ** ** ", " ** ** ", " **    "),
            String.join(" ", " ** **", " ** ** ", " ***** ", "  ***  "),
            String.join(" ", " ** **", " ** ** ", " **    ", "    ** "),
            String.join(" ", " ** **", " ** ** ", " **    ", "    ** "),
            String.join(" ", "  *** ", "  ***  ", " **    ", " ****  ")
        };

        // Enhanced for-loop for efficient traversal
        for (String line : banner) {
            System.out.println(line);
        }
    }
}