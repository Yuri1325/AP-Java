public class moon2 {
    
    public static void main(String[] args) {
         final int  hSpeedChange = 2000;
         final int  vSpeedChange = 3000;
        double totalChangeInSpeed = Math.sqrt(Math.pow(vSpeedChange, 2)+Math.pow(hSpeedChange, 2));
        System.out.println(totalChangeInSpeed);
        }
}
