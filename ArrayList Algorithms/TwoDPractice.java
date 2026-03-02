public class TwoDPractice {
    public static void main(String[] args) {
        int[][] nums2d = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        print2DArray(nums2d);
    }

    public static void print2DArray(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row)
                System.out.print(num + ",");
            System.out.println();
        }

    }
}
