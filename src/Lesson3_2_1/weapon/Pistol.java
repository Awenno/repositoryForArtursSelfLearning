package Lesson3_2_1.weapon;

public class Pistol extends Weapon {
    private String name;
    public Pistol(String name) {
        this.name = name;
    }

    @Override
    public void shot() {
        System.out.println("Вы выбрали " + name +", он стреляет пиу-пиу!");
    }
}
