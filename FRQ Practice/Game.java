 

public class Game {
    

    public Game(){
       
    }
    public boolean isBonus(){
        return true;
    }
    public void play(){}

    public int getScore(){
        int sum = 0;
        if(true){
            sum+= 10;
            if(true){
                sum+= 10;
                if(true){
                    sum+= 10;
                }
            }
        }
        if(isBonus()){
            sum *= 3;
        }
        return sum;
    }
    public int playManyTimes(int num){
        int highScore = 0;
        for(int i = 0; i<num; i++){
            play();
            if(getScore()>highScore){
                highScore = getScore();
            }
        }
        return highScore;
    }

}