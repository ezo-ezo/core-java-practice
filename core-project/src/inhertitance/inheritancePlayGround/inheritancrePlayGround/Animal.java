package inhertitance.inheritancePlayGround.inheritancrePlayGround;

public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        System.out.println("Animal constructor called");
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
