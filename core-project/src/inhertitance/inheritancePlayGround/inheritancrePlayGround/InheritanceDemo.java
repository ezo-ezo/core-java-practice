package inhertitance.inheritancePlayGround.inheritancrePlayGround;

public class InheritanceDemo {
    public static void main(String[] args) {
        // Create an instance of YashviGoldenRetriever
        YashviGoldenRetriever yashviDog = new YashviGoldenRetriever("Yashvi", 3, "Golden Retriever", "Tennis Ball");
        yashviDog.makeSound();

        System.out.println("--------------------------");

        Animal genericAnimal = new Animal("Generic Animal", 5);
        genericAnimal.makeSound();

        System.out.println("--------------------------");

        //Create an instance of dog
        Dog genericDog = new Dog("Generic Dog", 4, "Labrador");
        genericDog.makeSound();

        System.out.println("--------------------------");

        Animal anotherAnimal = new Dog("Tommy", 2, "Beagle");
        anotherAnimal.makeSound();
        System.out.println("Animal name: " + anotherAnimal.getName());

        System.out.println("--------------------------");

        System.out.println(yashviDog);
    }
}
