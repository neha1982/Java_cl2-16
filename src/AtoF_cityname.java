import java.util.Scanner;
//Input any alphabet from a to f and print their city name accordingly (use if else)
// any other alphabet should be invalid entry

public class AtoF_cityname {
    // input alphabet A to F and print city name according to
    public static void main(String[]args){
// using string - scanner - if/else - character
        String a,b,c,d,e,f,A,B,C,D,E,F;
        char ch;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F:");
        ch = scanner.next().charAt(0);

        if (ch == 'A' || ch =='a')
        { System.out.println("Aberdeen");}
        else if(ch == 'B' || ch =='b')
        {System.out.println("Banglore");}
        else if(ch == 'C' || ch == 'c')
        { System.out.println("Cambridge");}
        else if(ch == 'D' || ch =='d')
        { System.out.println("Dallas");}
        else if(ch == 'E' || ch == 'e')
        { System.out.println("Easton");}
        else if(ch == 'F' || ch == 'f')
        {System.out.println("Florence");}


    }
}
