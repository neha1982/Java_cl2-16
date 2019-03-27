import java.util.Scanner;

public class Odd_evenNo {
    //Jva main method
    public static void main (String[]args){
        //Object
        System.out.println("Enter Number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a%2==0){
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is odd");

        }

    }
}
