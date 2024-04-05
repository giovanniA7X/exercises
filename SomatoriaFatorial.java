import javax.swing.JOptionPane;

public class SomatoriaFatorial {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N "));
        double e = 1;
        for (int i = 1; i <= n; i++){
            int fatorial = 1;
            for (int parcFatorial = i; parcFatorial >= 2; parcFatorial--){
                fatorial *= parcFatorial;
            }
            double parcelaSoma = 1 / (double) fatorial;
            e += parcelaSoma;
            System.out.println("i: " + i + " Fatorial: " + fatorial + " ParcelaSoma " + parcelaSoma);
        }
        System.out.println("E: " + e);
    }
}
