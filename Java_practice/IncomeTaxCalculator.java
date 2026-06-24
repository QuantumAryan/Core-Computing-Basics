import java.util.Scanner;
public class IncomeTaxCalculator {
    static void main(String[] args){
//      This program calculates income tax paid by the employee
        Scanner sc=new Scanner(System.in);
        float income;
        System.out.print(" ENTER THE YOUR INCOME IN LAKHS PER ANNUM = ");
        income = sc.nextFloat();
        float tax =0;
        if(income<=2.5f){
            tax = tax +0;
            System.out.println(" YOU NOT HAVE TO PAY ANY INCOME TAX ON YOUR INCOME ");
        }
        else if(income>2.5f && income<=5.0){
            tax = tax + 0.05f * (income - 2.5f);
            System.out.println(" YOU HAVE TO PAY 5% INCOME TAX ON YOUR INCOME ");
        }
        else if(income>5.0 && income<=10.0){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
            System.out.println(" YOU HAVE TO PAY 20% INCOME TAX ON YOUR INCOME ");
        }
        else{
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
            System.out.println(" YOU HAVE TO PAY 30% INCOME TAX ON YOUR INCOME ");
        }
        System.out.println(" THE TOTAL INCOME TAX PAID BY THE EMPLOYEE = " + tax);
        sc.close();   // Closes the scanner to prevent memory leaks

    }