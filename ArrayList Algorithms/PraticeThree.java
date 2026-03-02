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

            for(String[] row: arr)
                {
                    int dupes = 0;
                    for(int i =0;i<row.length;i++)
                        {
                            for(int j =i+1;j<row.length;j++)
                                {
                                    if(row[i].equals(row[j]))
                                        dupes++;
                                }  
                        
                        }
                    if

                 }

}
