public class duplicatedElement {
    public static void main(String[] args) {

       String [] names = {"James", "John", "Sarah", "John", "Franc", "Sarah"};


        for (int i = 0; i < names.length; i++) {
            for (int j = i+1; j < names.length; j++) {
                if(names[i]==names[j]){
                    System.out.println(names[j]);
                }

            }

        }
    }
}
