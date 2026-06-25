import java.util.Scanner;
public class Leap_Year{
    public static void main(String[] args){
        //THIS PROGRAMME HELPS TO FIND THE YEAR ENTER BY THE USER IS LEAP YEAR OR NOT
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print(" ENTER THE YEAR = ");
        year =sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0){
            System.out.println(year + " IS A LEAP YEAR ");
        }
        else{
            System.out.println(year + " IS NOT ALEAP YEAR ");
        }

        sc.close();
    }
}
