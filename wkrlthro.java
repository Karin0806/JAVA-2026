import java.util.Scanner;

public class wkrlthro
 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("이름");
        Scanner age = new Scanner(System.in);
        System.out.print("나이");
        Scanner height = new Scanner(System.in);
        System.out.print("키");

        System.out.printf("안녕하세요. 저는 %s입니다", str);
        System.out.printf("만나서 반갑습니다");
        System.out.printf("제 나이는 %살이고, 키는 %.2f입니다.",age, height);
    }


}