package no6;
public class App {
    public static void main(String[] args) throws Exception {
        int[] amount = {0,0,0,0,0,0,0,0,0,0};
        int[] numbers = {1,2,3,4,2,9,3};
        for(int i = 0; i< numbers.length; i++){
            amount[numbers[i]]++;
        }
        System.out.println(amount[1]);
    }

    
}
