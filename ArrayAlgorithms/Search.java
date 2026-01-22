public class Search {
    public static void main(String[] args) {
        String[] names = { "Jack", "Uri", "Kiana", "Kellin", "Remi" };
        String kNames = "";
        for (String name : names) {
            if (name.substring(0, 1).equals("K"))
                kNames += "," + name;

        }
        System.out.println(kNames);
    }
}
