import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.err.print("정수를 입력하세요 : ");
        int s = scanner.nextInt();
        int m = s / 60;
        s %= 60;
        int h = m / 60;
        m %= 60;

        System.err.printf("%d시간 %d분 %d초", h, m, s);
    }
}
