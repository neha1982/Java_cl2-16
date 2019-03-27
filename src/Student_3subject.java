import java.util.Scanner;
//student name, roll no, 3 subjects marks and find out total,
// percentage and result if he is pass or fail on basis of percentage (pass>=35) and also give them grade
public class Student_3subject {
    public static void main(String[]args){// java main method
        float percentage;
        Scanner sc=new Scanner(System.in);// using scanner and find out total and percentage of 3 subject
        System.out.println("Student Name:");
        String name=sc.next();
        System.out.println("roll no: ");
        int rollno=sc.nextInt();
        System.out.println("biology: ");
        int bio=sc.nextInt();
        System.out.println("maths: ");
        int math=sc.nextInt();
        System.out.println("physics: ");
        int phys=sc.nextInt();

        float
                total=bio+math+phys;
        percentage=(total/300)*100;
        System.out.println("Total mark = "+total);
        System.out.println("Percentsge = "+percentage);

        }
}
