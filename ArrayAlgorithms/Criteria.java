public class Criteria {
    public static void main(String[] args) {
        String[] names = { "Jack", "Uri", "Kiana", "Kellin", "Remi" };
        int num = 0;
        for (String name : names)
            if (name.length() == 4)
                num++;

        System.out.println(num);
    }
}
