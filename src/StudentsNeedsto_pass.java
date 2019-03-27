import java.util.Scanner;
//above but pass or fails on the basis of..student needs to pass all the subjects
public class StudentsNeedsto_pass {
    public static void main(String[]args){
        Scanner sc =new Scanner((System.in));
        System.out.println("Dance:");
        int dance =sc.nextInt();
        System.out.println("Arts:");
        int arts =sc.nextInt();
        System.out.println("Music:");
        int music =sc.nextInt();
        if(35<=dance && 35<=arts && 35<=music)
        { System.out.println("pass");}
        else
        {System.out.println("Fail");}

    }
}
