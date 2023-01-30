import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("emails.txt");
        try {
            Files.lines(path).filter(line -> !line.startsWith("Spam")).forEach(line -> System.out.println(line));
        } catch (IOException e) {
            // TODO: handle exception
        }
    }
}