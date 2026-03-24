import java.util.Scanner;

public class wkrlthror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        System.out.print("키를 입력하세요: ");
        double height = sc.nextDouble();

        
        System.out.println("\n이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);

        System.out.println("\n안녕하세요. 저는 " + name + " 입니다.");
        System.out.println("만나서 반갑습니다.");
        System.out.println("\n제 나이는 " + age + " 이고, 키는 " + height + " 입니다.");

    }
} 
    

