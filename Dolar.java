import java.util.Scanner;

public class Dolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a cotacao do dolar");
        double cotacao = sc.nextDouble();
        System.out.println("Quantos dolares?");
        double dolares = sc.nextDouble();
        double real = dolares * cotacao;
        System.out.println("Voce tem o equivalente a R$"+real);
        sc.close();
    }
}
