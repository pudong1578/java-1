import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int intArr[];
        intArr = new int[5];

        System.out.println("양수 5개를 입력하세요.");

        for(int i = 0 ; i < 5; i++){
            intArr[i] = scan.nextInt();
            
        }
        double sum = 0.0;
        for(int i = 0; i < 5; i++){
            sum += intArr[i];
        }
        
        System.out.println("평균은 " + sum / 5);
        scan.close();
    }
}
