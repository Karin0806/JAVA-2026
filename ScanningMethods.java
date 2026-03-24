import java.util.Scanner;

class ScanningMethods
{
    public static void main(String[] args)
    {
        Scanner keyboard=new Scanner (System.in);

        int i = keyboard.nextInt () ;

        System.out.printf("입력한 숫자는 : %d ", i );

    }
}