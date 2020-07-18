package GuiaDoVendedor;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Conversor conversor = new Conversor(16, 14450, 195.5f);

        System.out.println("snob representa I");
        System.out.println("krok representa V");
        System.out.println("squid representa X");
        System.out.println("leij representa L");
        System.out.println("snob Prata = 16 créditos");
        System.out.println("snob Ouro  = 14450 créditos");
        System.out.println("snob Iron  = 195.5 créditos\n");

        System.out.println("Quanto você quer converter? Digite em idioma Intergalatico separado por espaço: ");
        String valorIntergalatico = scanner.nextLine();

        System.out.println("De qual minerio:\n1 - Silver\n2 - Gold\n3 - Iron\n4 - Nenhuma opção");
        int minerio = scanner.nextInt();

        conversor.conversorEspacialToRoman(valorIntergalatico);
        conversor.transformaRomanoEmArabe();
        conversor.retornaCredito(minerio, valorIntergalatico);










        scanner.close();
    }
}
