import java.io.*;
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("one");
        names.add("two");
        names.add("three");

        System.out.println(reverseList(names));
    }

    public static ArrayList<String> reverseList(ArrayList<String> list) {
        ArrayList<String> temp = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--)
            temp.add(list.get(i));
        return temp;
    }
}
