public class UC2_Greeting {
    public static void main(String[] args) {
        // Goal: Accept a name from command-line arguments
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello Guest");
        }
    }
}