package Lesson3_2_1.weapon;

public class Slingshot extends Weapon {
    private String name;
    public Slingshot(String name) {
        this.name = name;
    }

    @Override
    public void shot() {
        System.out.println("Вы выбрали " + name + ", она стреляет виу!");
    }
}
