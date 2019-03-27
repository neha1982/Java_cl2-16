import java.util.Scanner;
//input any two numbers and then print their interchanged value
public class Interchange_value {
    public static void main(String[]args){// java main method
        int a, b, temp;
        System.out.println("Enter A and B");
        Scanner in = new Scanner(System.in);// using scanner to break the input

        a = in.nextInt();
        b = in.nextInt();

        System.out.println("Before Swapping\na ="+a+" \nb = "+b);
        temp =a;
        a = b;
        b =temp;
        System.out.println("After Swapping\na="+a+" \nb ="+b);



    }
}
