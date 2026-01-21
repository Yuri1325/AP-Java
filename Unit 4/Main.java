public class Main {
    // Uri Richardson
    public static void main(String[] args) {
        int[] primeNums = { 2, 3, 5, 7, 11, 13, 17, 19 };
        String[] friends = { "Example 1", "Example 2", "Example 3" };
        int[] testGrades = { 98, 65, 77, 12, 100, 101, 89, 77 };
        System.out.println(primeNums.length);
        System.out.println(friends.length);
        int sum = 0;
        for (int i = 0; i < testGrades.length; i++)
            sum += testGrades[i];
        double average = sum / testGrades.length;
        int ic = 0;
        int sumw = 0;
        while (ic < testGrades.length) {
            sumw += testGrades[ic];
            ic++;
        }
        System.out.println("Average w:" + (double) sum / testGrades.length);
        System.out.println("Average:" + average);
    }

}
