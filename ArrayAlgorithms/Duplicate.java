public class Duplicate {
    public static void main(String[] args) {
        String[] classes = { "Math", "Physics", "Physics", "AP US History", "Lunch", "AP Java", "Capstone", "ELA 11R",
                "Health" };
        boolean cd = containsDuplicate(classes);
        System.out.println(cd);
    }

    public static boolean containsDuplicate(String[] arr) {
        int i = 0;
        while (i < arr.length) {
            for (int x = i + 1; x < arr.length; x++)
                if (arr[i].equals(arr[x]))
                    return true;
            i++;
        }
        return false;

    }
}
