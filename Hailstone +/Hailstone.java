import java.util.Scanner;

//Uri Richardson Hailstone



public class Hailstone {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = in.nextInt();
        for(int x =num;x>=1;x--){
            while(x!=1)
            {
                if (x%2==0)
                {
                    x/=2;
                }

                else
                {
                    x*=3;
                    x++;
                }

                System.out.println(x);
            }
        }
        in.close();
    }
}