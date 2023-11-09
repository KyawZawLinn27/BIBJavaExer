import java.util.Scanner;

public class tuto2c {
    public static void main(String[] args) {

        System.out.println("Hello and welcome from Tutorial 2 c!");
        Integer[] weight = {20,30,40,50};
        int len=weight.length;
        System.out.println(len);
        int tw=0;
        for (int i=0; i<len; i++){
            int w=weight[i];

            tw=tw+w;
            System.out.println(tw);
        }

        int avgweight=tw/len;
        System.out.println("Average weight: "+avgweight);

    }
}
