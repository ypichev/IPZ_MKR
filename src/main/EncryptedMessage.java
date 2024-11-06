package main;

public class EncryptedMessage extends MessageDecorator {
    public EncryptedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return encrypt(message.getContent());
    }

    private String encrypt(String content) {
        // Просте "шифрування" для прикладу
        return new StringBuilder(content).reverse().toString();
    }
}
