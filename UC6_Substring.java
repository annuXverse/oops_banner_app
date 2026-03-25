public class UC6_Substring {
    public static void main(String[] args) {
        if (args.length > 0) {
            String greeting = "Hello ";
            for (String name : args) {
                greeting += name + ", "; 
            }
            
                greeting = greeting.substring(0, greeting.length() - 2);
            
            System.out.println(greeting);
        } else {
            System.out.println("Hello, World!");
        }
    }
}