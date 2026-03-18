public class Printr {
    public static void main(String[] args) {
        printFunBlue(3);
        System.out.println("\n-----------------------------------------------------------------");
        printFunRed(3);
    }

    public static void printFunBlue(int num) {
        if (num < 1) {
            return;

        } else {
            System.out.print(num);

            printFunBlue(num - 1);

            return;
        }
    }

    public static void printFunRed(int num) {
        if (num < 1) {
            return;

        } else {

            printFunRed(num - 1);

            System.out.print(num);
            return;
        }
    }

}
