import java.util.Scanner;

//Uri Richardson
// 11/6/2025
//Will count the number of e's in any words
public class Counteess{
    public static void main(String[] args) {
        String word = "Westchester";
       
        
        System.out.print(RemovingEs(word));
    }
    public static int CountingEs(String word){
        int counter = 0;
        // for (char x:word.toLowerCase().toCharArray()){
        //     if (x=='e')
        //         counter++;
        // }
        for(int x = 0;x<word.length();x++){
            if(word.toLowerCase().substring(x,x+1)=="e")
                counter++;
                
                
        }
        return counter;

    }
    public static String  RemovingEs(String word){
        String newword = "";
        
        for(int x = 0;x<word.length();x++){
            if(!word.toLowerCase().substring(x,x+1).equals("e"))
                newword+=word.substring(x,x+1);
                
                
        }
        return newword;

    }
    public static String surgery(String word,String l1,String l2){
        String newword = "";
        
        for(int x = 0;x<word.length();x++){
            if(!(word.toLowerCase().substring(x,x+1).equals(l1))&&!(word.toLowerCase().substring(x,x+1).equals(l2)))
                newword+=word.substring(x,x+1);
                
                
        }
        return newword;
    }
}