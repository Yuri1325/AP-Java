public class MaximumValue {
    public static void main(String[] args) {
        int[] nums = { -2, 0, 5, 7, 9 };
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max)
                max = nums[i];

        System.out.println(max);
    }
}
