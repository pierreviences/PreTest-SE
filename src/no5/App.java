package no5;
public class App {
    public static void main(String[] args) throws Exception {
        char[] ch = {'Z', 'X', 'C'};
        char tmp;
        for (int i = 0; i < 5;i++){
            tmp = ch[0];
            ch[0]=ch[2];
            ch[1]= tmp;
            ch[2]=ch[1];
        }
        System.out.println(ch);
    }

    
}
