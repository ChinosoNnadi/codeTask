public class SwapTwoNumbers {
    public static void main(String[] args) {
        int num = 5;
        int num1 = 8;

        num = num+num1;
        num1 = num-num1;
        num = num-num1;

        System.out.println(num);
        System.out.println(num1);
    }
}
