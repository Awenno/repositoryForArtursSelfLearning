package Lesson3_2_1.weapon;

public class WaterGun extends Weapon {
    private String name;
    public WaterGun( String name) {
        this.name = name;
    }

    @Override
    public void shot() {
        System.out.println("Вы выбрали " + name + ", он стреляет \"звук журчания воды\"");
    }
}
