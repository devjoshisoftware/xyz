import java.util.Scanner;

public class Multiplication {
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            System.out.println("please enter the first digit");
            int a = scanner.nextInt();
            System.out.println("please enter the second digit");
            int b = scanner.nextInt();

            System.out.println("Multiplication of " + a + " and " + b + " is =" +(a*b));

        }

}
