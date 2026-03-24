public class UC5_EnhancedLoop {
    public static void main(String[] args) {
        if (args.length > 0) {
            // Enhanced For Loop (For-each) 
            System.out.print("Hello");
            for (String name : args) {
                System.out.print(" " + name);
            }
            System.out.println();
        } else {
            System.out.println("Hello World");
        }
    }
}