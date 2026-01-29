import java.io.IOException;

import java.io.*;
import java.util.*;

public class PokeImages {
    private static String fileName = "pokemon.csv";
    private static String[] content = new String[152];

    public static void main(String[] args) throws IOException {
        System.out.println(readFile());
    }

    public static int readFile() throws IOException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        int i = 0;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            content[i] = line;
            System.out.println(line);
            i++;
        }
        scanner.close();
        return i;
    }
}
