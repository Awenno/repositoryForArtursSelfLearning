package Lesson3_2_1.weapon;

public class RPG extends Weapon {
    private String name;
    public RPG(String name) {
        this.name = name;
    }

    @Override
    public void shot() {
        System.out.println("Вы выбрали " + name + ", он стреляет вжжжжух!");
    }
}
