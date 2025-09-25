import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int a=3, b=3, c=3;
        a += b;
        System.out.println(a+" / "+b);
        a-=b;
        System.out.println(a+" / "+b);
        b = a++;
        System.out.println(a+" / "+b);
        a = ++b;
        System.out.println(b+" / "+a);
        a = c++;
        System.out.println(a+" / "+b);
    }
}
