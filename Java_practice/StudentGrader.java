import java.util.Scanner;
public class StudentGrader{
    public static void main(String[] args){
        System.out.println("***ITS THE PROGRAMME WHICH CHEAK THE STUDENT PASS OR FAIL***");
        Scanner sc = new Scanner(System.in);
        byte Maths, Physics, Chemistry;
        System.out.print(" ENTER THE MARKS OF MATHEMATICS = ");
        Maths=sc.nextByte();

        System.out.print("ENTER THE MARKS OF PHYSCIS = ");
        Physics=sc.nextByte();

        System.out.print("ENTER THE MARKS OF CHEMISTRY = ");
        Chemistry=sc.nextByte();

        float a =(Maths+Physics+Chemistry)/3.0f;

        if(a>=40 && Maths>=33 && Physics>=33 && Chemistry>=33){
            System.out.println("%%%%CONGRATULATIONS! YOU ARE PASSED THE EXAM SUCCSESSFULLY%%%%");
        }
        else{
            System.out.println("****SOORY! YOU ARE FAILED****");
        }
        sc.close(); // Closes the scanner to prevent memory leaks
    }
}
