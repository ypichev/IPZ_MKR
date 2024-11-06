package main;

public class ChatMessageProcessor {
    public static void main(String[] args) {
        Message message = new SimpleMessage("Привіт, як справи?");
        System.out.println("Базове повідомлення: " + message.getContent());

        message = new EncryptedMessage(message);
        System.out.println("Після шифрування: " + message.getContent());

        message = new CompressedMessage(message);
        System.out.println("Після стиснення: " + message.getContent());

        message = new TimestampedMessage(message);
        System.out.println("Після додавання дати та часу: " + message.getContent());

        message = new AuthorMessage(message);
        System.out.println("Після додавання автора: " + message.getContent());
    }
}

