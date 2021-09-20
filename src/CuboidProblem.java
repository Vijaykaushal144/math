import java.util.Scanner;

public class CuboidProblem {
    public static void main(String[] args) {
        int length,breadth,height;
        int totalArea;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length ,breadth,height:");
        length  =sc.nextInt();
        breadth =sc.nextInt();
        height =sc.nextInt();
        totalArea=2*(length*breadth+length*height+breadth*height);
        int volume= length*breadth*height;
        System.out.println("Total area: "+totalArea );
        System.out.println("Total height : " +volume);



    }
}
