package chatapp;


public class ChatApp {
    public static void main(String[] args) {
        new VerySimpleChatServer().main();
        new SimpleChatClient().main();
    }
}
