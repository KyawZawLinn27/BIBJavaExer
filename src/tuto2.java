import java.util.Scanner;

public class tuto2 {
    public static void main(String[] args) {

        System.out.println("Hello and welcome from Tutorial 2!");
        Scanner myTest = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number");

        int test= myTest.nextInt();
        if (test>0){
            System.out.println("The number"+test+" is positive integer");

        }
        else {
            System.out.println("The number "+test+" is negative integer");
        }
    }

}
