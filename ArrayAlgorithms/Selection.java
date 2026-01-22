public class Selection {
    public static void main(String[] args) {
        String[] classes = { "Math", "Physics", "Physics", "AP US History", "Lunch", "AP Java", "Capstone", "ELA 11R",
                "Health" };
        for (int i = 0; i < classes.length - 1; i++)
            System.out.println(classes[i] + " " + classes[i + 1] + "\n");

        // Substract len by one to not go out of bounds
    }
}
