public class evenOdd {
    public static void main(String[] args) {
        int [][] num ={ {3, 8, 19, 6},
                {14, 17, 37, 54},
                {1, 44, 69, 15}
        };
        int sum = 0;

        for(int [] row:num){
            for(int col:row){
                sum = sum + col;
            }
        }
        System.out.println(sum);
    }
}
