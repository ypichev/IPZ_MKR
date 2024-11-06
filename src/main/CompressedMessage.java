package main;

public class CompressedMessage extends MessageDecorator {
    public CompressedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return compress(message.getContent());
    }

    private String compress(String content) {
        return content.replaceAll("\\s+", "");
    }
}
