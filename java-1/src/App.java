import java.util.Scanner;

public class App {
    static int[] makeArray(){
        int temp[] = new int[4];
        for(int i = 0; i < 4; i++){
            temp[i] = i;
        }
        return temp;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int intArray[] = makeArray();
        for(int i = 0; i < 4; i++){
            System.out.print(intArray[i] + " ");
        }
        scan.close();
    }
}
