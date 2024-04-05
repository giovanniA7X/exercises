public class Fibonacci {
    public static void main(String[] args) {
        int primeiro = 0;
        int segundo = 1;

        System.out.println("Seqûencia de Fibonacci com os primeiros 10 termos: ");
        for (int i = 1; i <= 10; i++){
            System.out.println(primeiro + " ");
            int soma = primeiro + segundo;
            primeiro = segundo;
            segundo = soma;
        }
    }
}
