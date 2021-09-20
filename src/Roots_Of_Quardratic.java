import java.util.Scanner;

class Roots_Of_Quadratic {
    public static void main(String[] args) {
        int num1,num2,num3;
        double root1,root2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three value num1,num2,num3 :");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        root1= (-num2+Math.sqrt(num2*num2-4*num1*num3))/(2*num1);
        root2= (-num2-Math.sqrt(num2*num2-4*num1*num3))/(2*num1);
        System.out.println("Roots are "+root1+" "+root2);



    }
}
