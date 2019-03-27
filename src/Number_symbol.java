import java.util.Scanner;
//two number and ask user to enter their symbol (+, -, /,*)
// find addition, subtraction, multiplication and division according to their symbol (using if else)
public class Number_symbol {
    public static void main(String[]args){//java main method
        int j,k,Ans;//input two number
        char ch;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number 1:");
        j = scanner.nextInt();

        System.out.println("Enter number 2:");
        k = scanner.nextInt();

        System.out.println("Enter symbol +,-,*,/");
        ch = scanner.next().charAt(0);
        if (ch == '+'){ Ans = j + k;
        System.out.println("Answer is = "+Ans);}
        else if(ch =='-'){Ans = j - k;
        System.out.println("Answer is= "+Ans);}
        else if(ch =='*'){Ans = j * k;
        System.out.println("Answer is= "+Ans);}
        else if(ch =='/'){Ans = j / k;
        System.out.println("Answer is= "+Ans);}
        else { System.out.println("Entered wrong symbol"); }
    }
}
