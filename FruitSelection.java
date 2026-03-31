import java.util.Scanner;

public class FruitSelection {
    public static void main(String[] args) {
        int fruit;


        System.out.println("숫자를 입력하시오: ");
        Scanner scan = new Scanner(System.in);
        fruit = scan.nextInt();

        switch(fruit) {
            case 1:
                System.out.println("사과");
                break;
            case 2:
                System.out.println("배");
                break;
            case 3:
                System.out.println("바나나");
                break;
            default:
                System.out.println("과일");
        }


    }
}