import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos descobrir se os seguintes numeros sao multiplos");
        System.out.println("Por favor, digite os numeros desejados");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ((a % b == 0) || (b % a == 0)) {

            System.out.println("São multiplos");
        }
        else {

            System.out.println("Não são multiplos");
        }

        sc.close();
    }
}