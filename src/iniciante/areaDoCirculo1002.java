package iniciante;

import java.util.Scanner;

public class areaDoCirculo1002 {
    public static void main(String[] args) {
        Double  π = 3.14159;
        Double raio;

        Scanner ler = new Scanner(System.in);

        raio = ler.nextDouble();

        Double area = π * raio * raio;

        System.out.printf("A=%.4f\n", area);

    }


}
