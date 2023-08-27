public class evenNumbers {
    public static void main(String[] args) {

        int [][] num ={ {3, 8, 19, 6},
                        {14, 17, 37, 54},
                        {1, 44, 69, 15}
                      };

        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                if(num[row][col]%2==0){
                    System.out.println(num[row][col]);
                }

            }
        }




    }
}
