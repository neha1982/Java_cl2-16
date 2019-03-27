import java.util.Scanner;
//input any year like 1989 and find out if it is leap year
public class LeapYR {

    public static void main(String[]args){   //java main method
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();  //using scanner to break the input
        boolean isleap = false;  //boolean for condition true or false
        if(year%400 == 0)
        {
            isleap = true;
        } else if (year%100 == 0)
        {
            isleap = false;
        }else if(year%4==0)
        {
            isleap = true;
        }
        else { isleap = false;}
        if(isleap)
        {
            System.out.println("Year " + year + " is a leap year");
        }
        else {
            System.out.println("Year " + year + " is not a leap year");

        }




    }
}
