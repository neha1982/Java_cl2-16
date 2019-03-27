import java.util.Scanner;
//user to provide any single character to Print Vowel or Consonant, depending on the user input
public class Vowel_consonant {
    public static void main(String[]args) {

        System.out.println("Enter an Alphabet:");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        { System.out.println("Input character is a vowel");
    }
        else{
            System.out.println("Input character is a consonant");
        }
    }
}
