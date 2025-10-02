import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("정수 5개를 입력하세요.");
        
        while (true) {
            System.out.print(">>");
            String text = scan.nextLine();
            if(text.equals("exit")) {break;}
        }

        System.out.println("종료합니다...");
        scan.close();
    }
}
