import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(in);
        out.print("n1 sayisi giriniz : ");
        int n1 = inp.nextInt();

        out.print("n2 sayisi giriniz : ");
        int n2 = inp.nextInt();
        int i = 1, ebob = 1, ekok = 1;

        while (i <= n1 && i < n2){
            if(n1 % i ==0 && n2 % i == 0){
                ebob = i;
            }
            i++;
        }
        ekok = n1 *n2 / ebob;
        out.println("EBOB : " +ebob);
        out.println("EKOK : " +ekok);

    }
}


