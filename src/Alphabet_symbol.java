import java.util.Scanner;
// Enter the value and find it out the value is a number or an alphabet or a special symbol
public class Alphabet_symbol {
    //jav main method
    public static void main(String[]args){
        //by using scanner creating a object and using if/else
        Scanner scanner=new Scanner(System.in);
        char char1 = scanner.next(). charAt(0);
        //check if value is a number-string concatenation
        if ((char1>=48 && char1<=57)|| char1==45) {
            System.out.println("Value is a Number");
        } //check value is an alphabet- string concatenation
        else if((char1>='a' && char1<='z')||(char1>='A' && char1<='Z'))
        {
            System.out.println("Value is an Alphabet");
        }
        else{ //wright else value is a special character- string concatenation
            System.out.println("Value is Special Character");
        }
    }
}
