import java.util.Scanner;
//Uri Richardson - 10/27/2025 - Guessing Game
public class main{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num =(int) (Math.random()*100);
    int userGuess = 101;
    boolean quit = false;
    while(userGuess!=num){
        System.out.println("Enter your guess - Or enter -1 to quit:  ");
        userGuess = input.nextInt();
        if(userGuess==-1){
            quit = true;
            break;
        }
        else if (userGuess>num)
            System.out.println("Lower!");
        else if (userGuess<num)
            System.out.println("Higher!");
        
    }
    if(quit){
        System.out.println("You exited the program");
    }else{
        System.out.println("You won the number was "+num);
    }

}


}