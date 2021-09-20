import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  num1 ,num2 number:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num1=num1+num2; //num1=5 num2=10
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("num1 is: " + num1 + "   and   num2 is  " +num2);


    }
}
