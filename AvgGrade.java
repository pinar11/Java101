
import java.util.Scanner;
public class AvgGrade {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int math, physics, history, music, turkish, chem;
        System.out.println("Please enter your math grade:");
        math=input.nextInt();
        System.out.println("Please enter your physics grade:");
        physics= input.nextInt();
        System.out.println("Please enter your history grade:");
        history= input.nextInt();
        System.out.println("Please enter your music grade:");
        music= input.nextInt();
        System.out.println("Please enter your turkish grade:");
        turkish= input.nextInt();
        System.out.println("Please enter your chem grade:");
        chem= input.nextInt();

        int total = (math + physics + history + music + turkish + chem);
        double result = (total/6.0);
        System.out.println("Your average grade is:" +result);

        System.out.println(result<60 ?  "You failed" : "You passed");


    }
}