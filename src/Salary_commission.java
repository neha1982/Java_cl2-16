import java.util.Scanner;
//input sales id, seller's name, sales amount, salary basic and then find this sales commission
public class Salary_commission {
    public static void main(String[]args){
        double salesamount,salarybasic,commission; //using double, scanner
        double commissionrate=0.0;  //commission is devide by salesamount
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter seller id: ");
        int id=reader.nextInt();
        System.out.println("Enter seller name: ");
        String name=reader.next();
        System.out.println("Enter sales amount: ");
        salesamount=reader.nextDouble();
        System.out.println("Enter salary basic: ");
        salarybasic=reader.nextDouble();

        if(salesamount>=50000)commissionrate=0.35;
        else if(salesamount>=30000)commissionrate=0.20;
        else if(salesamount>=20000)commissionrate=0.10;
        else if(salesamount>=10000)commissionrate=0.05;
        else commissionrate=0.02;
        commission=commissionrate*salesamount;
        System.out.println("Commission is: " +commission);

    }
}
