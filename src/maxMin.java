public class maxMin {
    public static void main(String[] args) {
        int[] num = {2, 50,16, 86, 1};
        int max = num[0], min = num[0];

        for(int n:num){
            if(n>max){
                max = n;
            }if(n<min){
                min = n;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
