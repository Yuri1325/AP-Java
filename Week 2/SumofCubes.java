import java.util.Scanner;

import java.util.*;
class SumofCubes{
    
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number:");
    

    int num = input.nextInt();
    int sum = 0;
    int tempCube;
    while (num > 0){
        tempCube = (int)(Math.pow(num%10,3));
        sum+=tempCube;
        num/=10;
    }

    
    System.out.print("The sum is: "+sum);
    
}


}