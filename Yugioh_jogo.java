public class Yugioh_jogo {
    public static void main(String[] args) {
        Yugioh_card darkMagician = new Yugioh_card("Mago Negro", "Monstro", 2500, 2100);
        Yugioh_card blueEyesWhiteDragon = new Yugioh_card("Dragão Branco de Olhos Azuis", "Monstro", 3000, 2500);
        Yugioh_card mirrorForce = new Yugioh_card("Força do Espelho", "Armadilha", 0, 0);

        
    darkMagician.displayCardInfo();
    blueEyesWhiteDragon.displayCardInfo();
    mirrorForce.displayCardInfo();
    }
}
