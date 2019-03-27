import java.util.Scanner;
//The person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old.
public class Eligible_vote {  //class name

    public static void main(String[] args){ //java main method
// eligible person can vote age above 18 or age 18
        eligibility();
    }
        static void eligibility(){
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
            age=scanner.nextInt();
            if(age>=18){
            System.out.println("You are eligible for vote.");
            } else{
                System.out.println("You are not eligible for vote");
            }




    }
}
