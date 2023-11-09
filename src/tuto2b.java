import java.util.Scanner;

public class tuto2b {
    public static void main(String[] args) {

        System.out.println("Hello and welcome from Tutorial 2 b!");
        Scanner myTest = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter First number");
        int num1= myTest.nextInt();
        System.out.println("Enter Second number");
        int num2= myTest.nextInt();
        System.out.println("Enter Third number");
        int num3= myTest.nextInt();
        System.out.println(num1+","+num2+","+num3);
        if (num1>num2){
            if (num1>num3){
                System.out.println("Number 1 is Greatest number");
            }
            else
                System.out.println("Number 3 is the Greatest Number");
        }
        else
            if (num2>num3){
                System.out.println("Number 2 is the Greatest Number");

            }
            else
                System.out.println("Number 3 is the Greatest Number");

    }
}
