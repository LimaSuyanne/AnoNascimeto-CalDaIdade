import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Ano de Nascimento");
        int nasc = t.nextInt();
        int i = 2022 -nasc;
        System.out.println("Sua idade é " +  i +  " anos");
        if (i>=18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}