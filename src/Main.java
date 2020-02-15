import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder text = new StringBuilder();
        InputStreamReader reader = new InputStreamReader(new FileInputStream(args[0]));
        //reader.read();
        while (reader.ready()) {
            text.append((char)reader.read());
        }
        Parser parser = new Parser(text.toString());
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("output.csv"));
        parser.parse(writer);

        reader.close();
        writer.close();
    }

}

