import java.util.ArrayList;

public class AlgorithmsHW 
    {
        public static void main(String[] args) {
            ArrayList<Integer> nums = new ArrayList<>();

            for (int i = 0; i < 50; i++) 
                nums.add((int) (Math.random() * 101)); 

            System.out.println("Original: "+ nums);
            System.out.println("Sum: "+sum(nums));
            System.out.println("Average: "+ average(nums));
            System.out.println("Max: "+ max(nums));
            System.out.println("Min: "+ min(nums));





        }
        
        public static int sum(ArrayList<Integer> list)
            {
                int sum = 0;
                for(int i:list)
                    sum+=i;
                return  sum;
            }
        public static double average(ArrayList<Integer> list)
            {
                int sum = 0;
                for(int i:list)
                    sum+=i;
                double avg = (double)sum/list.size();
                return  avg;
            }
        public static int max(ArrayList<Integer> list)
            {
                int max = Integer.MIN_VALUE;
                for(int i = 0;i<list.size();i++)
                    if(list.get(i)>max){max = list.get(i);}
                return max;
            }
        public static int min(ArrayList<Integer> list)
            {
                int min = Integer.MAX_VALUE;
                for(int i = 0;i<list.size();i++)
                    if(list.get(i)<min){min = list.get(i);}
                return min;
            }

        public static boolean findDuplicates(ArrayList<Integer> list)
            {
                for(int i = 0;i<list.size();i++)
                {
                    for(int j = i+1;i<list.size();i++)
                        if(list.get(i).equals(list.get(j))){return  true;}

                }
                return false;
            }
        public static void acessDuplicates(ArrayList<Integer> list)
            {
                //Instructions not specified.........
            }

    }