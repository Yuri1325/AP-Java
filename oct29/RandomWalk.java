public class RandomWalk {
    public static void main(String[] args) {
        


        int average= 0;
        for(int i =1;i<=50;i++){
            int pos =4;
            int z = 0;
            while(pos>=1&&pos<=7){
                int r = (int)(Math.random()*2);
                
                if (r%2==0)
                    pos++;
                else
                    pos--;
                z++;
                System.out.println("pos: "+pos+" index:"+i);
            }
            average+=z;
        }
        average/=50;
        System.out.println(average);
    }
}
