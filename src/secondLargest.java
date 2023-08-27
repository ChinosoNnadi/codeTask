public class secondLargest {
    public static void main(String[] args) {
        int[] num = {2, 50,16, 86, 1};

        int secondLargest = 0;
        int largest = 0;

        for(int i=0; i<num.length; i++){
            if(num[i]>largest){
                secondLargest=largest;
                largest=num[i];
            }
        } System.out.println(secondLargest);

    }
}
