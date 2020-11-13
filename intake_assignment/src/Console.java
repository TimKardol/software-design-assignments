import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Console {

    public Console() throws FileNotFoundException {
       System.setOut(new PrintStream(new File("output.txt")));
    }

    public void log(String message) {
        System.out.println(message);
    }
}
