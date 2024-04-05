import java.util.Scanner;

class exercicio1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura");
        double a=sc.nextDouble();
        System.out.println("Digite a base");
        double b=sc.nextDouble();

        double area=a*b;
        System.out.println("A area do retangulo e: "+area);
    }
}

