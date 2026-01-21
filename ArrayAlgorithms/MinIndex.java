public class MinIndex {
    public static void main(String[] args) {
        int[] nums = { -2, 0, 5, 7, 9 };
        int min = Integer.MAX_VALUE;
        int indx = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] < min) {
                min = nums[i];
                indx = i;
            }
        System.out.println(indx);

    }
}
