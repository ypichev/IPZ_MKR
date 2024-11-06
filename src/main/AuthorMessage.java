package main;

public class AuthorMessage extends MessageDecorator {
    public AuthorMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return addAuthor(message.getContent());
    }

    private String addAuthor(String content) {
        return content + " - Карлик Максим";
    }
}
