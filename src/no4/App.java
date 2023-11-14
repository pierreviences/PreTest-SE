package no4;
public class App {
    public static void main(String[] args) throws Exception {
        int result = countXY(3, 4);
        System.out.println("The sum is: " + result);
    }

    public static int countXY(int x, int y){
        int count = x + y;
        return count;
    }
}
