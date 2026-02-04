import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Integer i = 30;
        Double d = 40.3;
        System.out.println(Integer.MAX_VALUE + "\n" + Integer.MIN_VALUE);
        int w = i;
        double l = d;
        System.out.println(w * l);

        ArrayList<String> list = new ArrayList<String>();
        list.add("Micheal");
        list.add("Jesica");
        list.add("Remi");
        list.add(1, "Jayanth");

        String store = list.set(2, "Mary");
        String store2 = list.get(3);
        // System.out.println();
        ////////////////////////////////////////////////// 2/3/2026 4.9 warm up
        ArrayList<String> names = new ArrayList<String>();
        names.add("Micheal");
        names.add("Jesica");
        names.add("Remi");
        names.add(1, "Jayanth");
        int ii = 0;
        while (ii < names.size())

        {
            System.out.println(names.get(ii));
            ii++;
        }

        for (int z = 0; z < names.size(); z++)
            System.out.println(names.get(z));

        for (String name : names)
            System.out.println(name);

        for (int j = 0; j < names.size(); j++) {
            if (names.get(j).substring(0, 1).equals("J"))
                names.set(j, "Student C");
        }
        for (int j = 0; j < names.size(); j++) {
            if (names.get(j).indexOf("al") >= 0)
                names.remove(j);
        }

    }
}