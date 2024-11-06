package main;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampedMessage extends MessageDecorator {
    public TimestampedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return addTimestamp(message.getContent());
    }

    private String addTimestamp(String content) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return content + " [" + sdf.format(new Date()) + "]";
    }
}
