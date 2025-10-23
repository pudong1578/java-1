import java.util.Scanner;

class Ractangle{
    int width;
    int hight;
    public int getArea(){
        return width *  hight;
    }
}

public class App {
    public static void main(String[] args){
        Ractangle rect = new Ractangle();
        Scanner scan = new Scanner(System.in);
        System.out.print(">> ");
        rect.width = scan.nextInt();
        rect.hight = scan.nextInt();
        System.out.printf("사각형의 넓이는 : %d", rect.getArea());
    }
}
