import java.util.Scanner;
//input any five number and then find average of five numbers
public class Average_five {
    public static void main(String[]args){//java main method
        Scanner in = new Scanner(System.in);// input any number nd divide by 5

        System.out.println("Input first number:");
        int num1 =in.nextInt();

        System.out.println("Input second number:");
        int num2 =in.nextInt();

        System.out.println("Input third number:");
        int num3 =in.nextInt();

        System.out.println("Input fourth number:");
        int num4 =in.nextInt();

        System.out.println("Enter fifth number:");
        int num5 =in.nextInt();

        System.out.println("Average of five numbers is:" + (num1 + num2 + num3 + num4 + num5)/5);
    }
}
