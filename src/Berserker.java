public class Berserker extends Fighter {

    public Berserker(String name) {
        this.name = name;
        this.type = "Berserker";

        this.health += 20;
        this.damage += 5;
    }
}
