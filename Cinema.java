import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o valor do ingresso");
        double valorIngresso = leitor.nextDouble();
        System.out.println("Digite sua idade");
        int idade = leitor.nextInt();

        if (idade <= 2) {
            System.out.println("Entrada Gratuita");
        } else if (idade < 18 || idade >= 65) {
            System.out.println("O valor do ingresso é: " + valorIngresso/2);
        } else {
            System.out.println("O valor do ingresso é: " + valorIngresso);
        }
        leitor.close();
    }
}