public class UC3 {
    public static void main(String[] args) {
        // UC3: Refactoring to use String.join() for better memory management
        // Each line uses a space " " as a delimiter to join letter parts
        System.out.println(String.join(" ", "  *** ", "  *** ", " ***** ","  **** "));
        System.out.println(String.join(" ", " ** **", " ** **", " ** ** "," **    "));
        System.out.println(String.join(" ", " ** **", " ** **", " ***** ","  ***  "));
        System.out.println(String.join(" ", " ** **", " ** **", " **    ","    ** "));
        System.out.println(String.join(" ", " ** **", " ** **", " **    ","    ** "));
        System.out.println(String.join(" ", "  *** ", "  *** ", " **    "," ****  "));
    }
}