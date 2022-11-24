package iniciante;

import java.util.Scanner;

public class extermamenteBasico1001 {

    public static void main(String[] args) {
        int A;
        int B;

        Scanner ler = new Scanner(System.in);

        A = ler.nextInt();
        B= ler.nextInt();

        System.out.println("X = " + (A+B));

        ler.close();
    }


}
