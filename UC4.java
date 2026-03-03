public class UC4 {
    public static void main(String[] args) {
        // Goal: Use an Array and a Loop for better modularity
        String[] banner = {
            String.join(" ", "  *** ", "  *** ", " ***** ","  **** "),
            String.join(" ", " ** **", " ** **", " ** ** "," **    "),
            String.join(" ", " ** **", " ** **", " ***** ","  ***  "),
            String.join(" ", " ** **", " ** **", " **    ","    ** "),
            String.join(" ", " ** **", " ** **", " **    ","    ** "),
            String.join(" ", "  *** ", "  *** ", " **    "," ****  ")
        };       
        for (String line : banner) {
            System.out.println(line);
        }
    }
}