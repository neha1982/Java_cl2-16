import java.util.Scanner;
//Input any number, the day name of the week print by using if/else
public class Weekdays {
    public static void main(String[]args){ //java main method
        int day;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);//scanner is creat an object
        day = sc.nextInt();
        if (day == 1) //by using if else and string concatenation, using with assignment sign
            System.out.println("Day of the week Sunday");
        else if (day ==2)
            System.out.println("Day of the week Monday");
        else if(day ==3)
            System.out.println("Day of the week Tuesday");
        else if (day ==4)
            System.out.println("Day of the week Wednesday");
        else if (day ==5)
            System.out.println("Day of the week Thursday");
        else if (day ==6)
            System.out.println("Day of the week Friday");
        else if (day ==7)
            System.out.println("Day of the week Saturday");
    }
}
