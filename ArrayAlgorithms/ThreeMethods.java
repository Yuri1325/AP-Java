public class ThreeMethods {
    public static void main(String[] args) {
        max();
        min();
        locateMinimum();
    }



    public static int max()
        {
            int[] nums = { -2, 0, 5, 7, 9 };
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max)
                max = nums[i];

        return max;

        }
        
        public static int min()
        {
            int[] nums = { -2, 0, 5, 7, 9 };
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] < min)
                min = nums[i];

        return min;

        }  
    public static int locateMinimum() {

        int[] nums = { -2, 0, 5, 7, 9 };
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] < min)
                min = i;

        return min;

    }

}
