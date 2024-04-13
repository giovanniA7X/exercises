public class Yugioh_card {
    private String name;
    private String type;
    private int attack;
    private int defense;

    public Yugioh_card(String name, String type, int attack, int defense){
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.defense = defense;
    }
    public void displayCardInfo(){
        System.out.println("Nome: " + name);
        System.out.println("Tipo: " + type);
        if (type.equalsIgnoreCase("Monstro")){
            System.out.println("Ataque: " + attack);
            System.out.println("Defesa: " + defense);
        }
        System.out.println("----------");
    }
}
