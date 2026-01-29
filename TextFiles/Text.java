import java.io.*;
import java.util.Scanner;

public class Text {

    public static void main(String[] args) throws IOException {
        File file = new File("pokemon.csv");
        Scanner scanner = new Scanner(file);
        String[] content = new String[10];
        int i = 0;
        while (scanner.hasNext() && i < 10) {
            String line = scanner.nextLine();
            content[i] = line;
            System.out.println(line);
            i++;
        }
    }
}