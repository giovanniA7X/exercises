import java.util.Scanner;

public class Ano_bissexto {
    public static void main(String[] args) {
        long a, y, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o ano");
              y=sc.nextLong();
        if (y!=0) {
            a = (y % 400 == 0) ? (c = 1) : ((y % 100 == 0) ? (c = 0) : ((y % 4 == 0) ? (c = 1) : (c=0)));
            if (a==1)
            System.out.println(y+"é um ano bissexto");
            else
            System.out.println(y+"nao e um ano bissexto");
        }      
        else
        System.out.println("ano zero nao existe");

        sc.close();
    }
    
}
