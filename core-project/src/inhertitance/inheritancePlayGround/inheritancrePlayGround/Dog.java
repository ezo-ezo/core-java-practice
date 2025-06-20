package inhertitance.inheritancePlayGround.inheritancrePlayGround;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // Call the constructor of the superclass (Animal)
        System.out.println("Dog constructor called");
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}
