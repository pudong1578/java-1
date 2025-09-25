import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        if(m >= 3 && m <= 5){
            System.out.println("봄");
        }else if(m >= 6 && m <= 8){
            System.out.println("여름");
        }else if(m >= 9 && m <= 11){
            System.out.println("가을");
        }else if(m >= 12 || m <= 2){
            System.out.println("겨울");
        }
    }
}
