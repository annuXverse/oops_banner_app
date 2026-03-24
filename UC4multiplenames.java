public class UC4multiplenames {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello " + String.join(", ", args));
        } else {
            System.out.println("Hello World");
        }
    }
}