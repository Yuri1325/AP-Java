import java.util.Scanner;

public class main{

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 1 for Program - Enter 2  for Program: ");
    int program = input.nextInt();
    System.out.println("Enter your number: "); 
    int num = input.nextInt();
    switch (program) {
        case 1:
           System.out.println("The number of factors is "+ findNumberOfFactors(num));
           System.out.print("Prime: "+isPrime(num));
            break;
    
        case 2:
            System.out.println("There are "+numOfPrimes(num)+" from 2 to "+num);
            break;
    }
    
}





//Program 1
public static int findNumberOfFactors(int x){
    int i = 1;
    int num=0;
    while (i<=9){
        if(i*(x/i)==x){
           num++;
        }
        i++;
    }
    return num;
}
//Program 1

public static boolean isPrime(int x){
    if (findNumberOfFactors(x)==1)
        return true ;
    else 
        return false;
    
}
//Program 2

public static int numOfPrimes(int x){
    int i = 2;
    int num = 0;
    while (i<x){
        if(isPrime(i))
            num++;

    }
    return num;
}




}