public class lowestHighestTemp {
    public static void main(String[] args) {
        float [] temp = {34, 23, 17, -3, 35, 26, 6};

        float highest = temp[0];
        float lowest = temp[0];

        for(float n:temp){
            if (n>highest){
                highest=n;
            }
            if(n<lowest){
                lowest=n;
            }

        }System.out.println(lowest);
        System.out.println(highest);

    }
}
