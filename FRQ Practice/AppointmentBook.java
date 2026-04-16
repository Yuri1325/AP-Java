public class AppointmentBook {
    private boolean isMinuteFree(int period, int minute){
        return true;
    }
    private void reserveBlock(int period, int startMinute, int duration){

    }

    public int findFreeBlock(int period, int duration){
        int count = 0;
        int counter = 0;
        while(count<duration && counter<59){
            if(isMinuteFree(period, counter)){
                count++;
            }
            else{
                count = 0;
            }
            counter++;
        }
        if(count == duration){
            return counter-duration;
        }
        else{
            return -1;
        }
    }

    public boolean makeAppointment(int startPeriod, int endPeriod, int duration){
        boolean reserved = false;
        for(int i = startPeriod; i<= endPeriod; i++){
            if(reserved == false){
                if(findFreeBlock(i,duration) != -1){
                    reserveBlock(i, findFreeBlock(i, duration), duration);
                    reserved = true;
                }
            }
        }
        return reserved;
    }
}