import java.util.Scanner;

public class CalculadoraDoseVeterinaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Dose Veterinária");
        System.out.println("------------------------------");

        // Obter o peso do animal em quilogramas
        System.out.print("Informe o peso do animal (em quilogramas): ");
        double peso = scanner.nextDouble();

        // Obter a concentração do medicamento (por exemplo, mg/mL)
        System.out.print("Informe a concentração do medicamento (em mg/mL): ");
        double concentracao = scanner.nextDouble();

        // Obter a dose recomendada por quilograma de peso corporal (em mg/kg)
        System.out.print("Informe a dose recomendada por quilograma de peso corporal (em mg/kg): ");
        double dosePorKg = scanner.nextDouble();

        // Calcular a dose total necessária
        double doseTotal = peso * dosePorKg; // dose em mg
        System.out.println("A dose total necessária para o animal é: " + doseTotal + " mg");

        // Calcular o volume necessário do medicamento
        double volumeNecessario = doseTotal / concentracao; // volume em mL
        System.out.println("O volume necessário do medicamento é: " + volumeNecessario + " mL");

        scanner.close();
    }
}
