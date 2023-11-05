public class HelloGoodbye {
    public static void main(String[] args){
        greetUsers(args);
        byeUsers(args);
    }
    private static void greetUsers(String[] userNames){
        System.out.println("Hello "+userNames[0]+" and "+userNames[1]+".");
    }
        private static void byeUsers(String[] userNames){
        System.out.println("Goodbye "+userNames[1]+" and "+userNames[0]+".");
    }
}
