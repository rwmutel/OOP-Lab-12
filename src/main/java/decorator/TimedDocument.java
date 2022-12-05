package decorator;

import com.google.cloud.vision.v1.*;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class TimedDocument implements Document {
    public String gcsPath;
    @Override
    @SneakyThrows
    public String parse() {
        long start = System.currentTimeMillis();
        String text = new SmartDocument(gcsPath).parse();
        long elapsedTime = System.currentTimeMillis() - start;
        return text + "\nElapsed time in milliseconds: " + elapsedTime;
    }
}
