import java.util.Scanner;

public class tlftmqj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력해주세요 : ");
        int num = sc.nextInt();

        int result = num - 10;

        System.out.println("이 값에서 10을 빼면 " + result + "입니다.");
 
    }
}
