public class Average {
    public static void main(String[] args) {
        int[] nums = { -2, 0, 5, 7, 9 };
        double sum = 0;
        double average = 0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i];

        average = ((double) sum / nums.length);
        System.out.println(average);
    }
}
