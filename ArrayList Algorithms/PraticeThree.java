public class PraticeThree {
    public static void main(String[] args) {
        String[][] names = {
                { "Jack", "Jill", "Jane", "Joey" },
                { "Maura", "Molly", "Mason", "Maureen" },
                { "Emma", "Eileen", "Elizabeth", "Emma" } };

        for (String[] row : shortenMe(names)) {
            for (String name : row)
                System.out.println(name);
        }

    }

    public static String[][] shortenMe(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = arr[i][j].substring(0, 3);
        }

        return arr;
    }

    public static int countDuplicates(String [][] arr)
    
        {
            int max = 0;
            int index = 0;

            for(int v =0; v<arr.length;v++)
                {
                    int dupes = 0;
                    for(int i =0;i<arr[v].length;i++)
                        {
                            for(int j =i+1;j<arr[v].length;j++)
                                {
                                    if(arr[v][i].equals(arr[v][j]))
                                        dupes++;
                                }  
                        
                        }
                    if(dupes>max)
                    {
                        max = dupes;
                        index = v;
                    }
                        

                 }
            return index;

}
    // public static String[][] shift(String[][] arr)
    //     {
           
    //         int numRow = arr.length;
    //         int numColl = arr[0].length;
    //         String[][] rArray = new String[numRow][numColl];
    //         int counter = 0;

    //        for(int i = numRow -1;i>0;i--)
    //             {
    //                 for(int j = numColl;j>0;j--)
    //                 {
    //                     arr[i].
    //                     counter++;
    //                 }
    //             }
    //     }
    //Very confused on how this possible u cant add or shits elements
    //  in arrays it used 1 index  the previous element there will be removed
}