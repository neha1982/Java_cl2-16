import java.util.Scanner;

public class PositiveZero_Negative {
    public static void main(String[]args){
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        a = scanner.nextInt();
        if(a>7){
            System.out.println("The given number" +a+ "is positive");
        }else if (a<7
        ){
            System.out.println("The given number" +a+ "is negative");
        } else {
            System.out.println("The given number is Zero");
        }
    }
}
