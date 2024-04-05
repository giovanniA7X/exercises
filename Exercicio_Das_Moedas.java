import java.util.Scanner;
public class Exercicio_Das_Moedas {
    
        public static void calcularNotas(int troco) {
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int[] quantidadeNotas = new int[notas.length];
                for (int i = 0; i < notas.length; i++) {
            quantidadeNotas[i] = troco / notas[i];            troco %= notas[i];        }                System.out.println("Notas de 100: " + quantidadeNotas[0]);
        System.out.println("Notas de 50: " + quantidadeNotas[1]);
        System.out.println("Notas de 20: " + quantidadeNotas[2]);
        System.out.println("Notas de 10: " + quantidadeNotas[3]);
        System.out.println("Notas de 5: " + quantidadeNotas[4]);
        System.out.println("Notas de 2: " + quantidadeNotas[5]);
        System.out.println("Moedas de 1: " + quantidadeNotas[6]);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do troco: ");
        int troco = scanner.nextInt();
        
        calcularNotas(troco);
        
        scanner.close();
    }
}