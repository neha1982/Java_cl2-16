import java.util.Scanner;
//employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
//HRA = basic salary 10%
//DA = Basic salary 8%
//TA = Basic salary 9%
//PF= Basic salary 20%
//Gross salary = basic salary + HRA + TA + DA -PF
public class Salary_gross {
    public static void main(String[]args){
        double basicslary,DA,HRA,TA,PF,Grosssalary;

        Scanner reader=new Scanner(System.in);
        System.out.println("Enter employee ID: ");
        int id=reader.nextInt();
        System.out.println("Enter employee name: ");
        String name=reader.next();
        System.out.println("Enter basic salary: ");
        basicslary=reader.nextDouble();

        DA=(basicslary*8)/100;
        HRA=(basicslary*10)/100;
        TA=(basicslary*9)/100;
        PF=(basicslary*20/100);

        Grosssalary=basicslary+DA+HRA+TA-PF;

        System.out.println("Dearness allownce:  "+DA);
        System.out.println("House rent allownce:"+ HRA);
        System.out.println("Travel allownce:"+TA);
        System.out.println("Provided fund: "+PF);
        System.out.println("Gross salary:"+Grosssalary);
    }
}
