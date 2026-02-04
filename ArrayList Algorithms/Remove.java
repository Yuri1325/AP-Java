import java.util.ArrayList;
import java.util.Arrays;

public class Remove {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>(Arrays.asList("a", "b", "b", "c", "d"));
        System.out.println(removeElement(letters, "b"));
    }

    public static ArrayList<String> removeElement(ArrayList<String> list, String element) {
        ArrayList<String> temp = list;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals(element))
                temp.remove(i);
        }
        return temp;
    }
}
