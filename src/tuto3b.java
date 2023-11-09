import java.util.ArrayList;
import java.util.Scanner;

public class tuto3b {
    public static void main(String[] args) {

        System.out.println("Hello and welcome from Tutorial 3 b!");
        ArrayList<Integer> age=new ArrayList<>();
        age.add(30);
        age.add(23);
        age.add(20);
        age.add(27);
        System.out.println("age "+age.get(2));
        Scanner agescan=new Scanner(System.in);
        System.out.println("Enter a number that you want to remove");
        int nmremove= agescan.nextInt();
        System.out.println(nmremove);
        age.remove(nmremove);
        System.out.println("All age list:");
        for (Integer ages:age) {
            System.out.println(age);

        }



}
}
