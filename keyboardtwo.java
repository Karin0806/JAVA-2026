import java.util.Scanner;

public class keyboardtwo
{
    public static void main(String[] args) 
    {
        Scanner keyboard=new Scanner (System.in);
        System.out.print("당신의 이름은? ");
        String str=keyboard.nextLine();
        System.out.println("안녕하세요, " + str + "님");
        System.out.print("당신은 스파게티를 좋아한다는데, 진실입니까?");
        boolean isTrue=keyboard.nextBoolean();
        if(isTrue==true)
            System.out.println("오~ 좋아하는군요.");
        else
            System.out.println("이런 아니었군요.");
    }
}


