import java.util.Scanner;
public class IncomeTaxCalculator {
    static void main(String[] args){
//      This program calculates income tax paid by the employee
        Scanner sc=new Scanner(System.in);
        float income;
        System.out.print(" ENTER THE YOUR INCOME = ");
        income = sc.nextFloat();
        if(income>=2.5 || income<5.0){
            System.out.println(" YOU HAVE TO PAY 5% INCOME TAX ");
        }
        else if(income>=5.0 || income<10.0){
            System.out.println(" YOU HAVE TO PAY 20% INCOME TAX ");
        }
        else{
            System.out.println(" YOU HAVE TO PAY 30% INCOME TAX ");
        }
        sc.close();   // Closes the scanner to prevent memory leaks

    }
}
