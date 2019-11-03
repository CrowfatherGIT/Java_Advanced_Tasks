package JavaAdvancedFinal;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileWordCount {

    public static void main(String args[]) {

        Path textFilePath = Paths.get("/Users/fudo/IdeaProjects/Java Advanced/src/JavaAdvancedFinal/input.txt");
        try {
            Stream<String> Lines = Files.lines(textFilePath, Charset.defaultCharset());
            Stream<Integer> integerStream = Lines.map(line -> line.split(" ").length);
            integerStream.forEach(System.out::println);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}