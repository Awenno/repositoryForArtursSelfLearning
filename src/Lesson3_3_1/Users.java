package Lesson3_3_1;

public abstract class Users {

    private String name;
    public String getName() {
        return name;
    }

    public Users(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }

}
