import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int intArr[];
        intArr = new int[5];

        int max = 0;
        System.out.println("양수 5개를 입력하세요.");

        for(int i = 0 ; i < 5; i++){
            intArr[i] = scan.nextInt();
            if(intArr[i] > max){
                max = intArr[i];
            }
        }
        System.out.println("가장 큰 수는 " + max + "입니다.");
        scan.close();
    }
}
