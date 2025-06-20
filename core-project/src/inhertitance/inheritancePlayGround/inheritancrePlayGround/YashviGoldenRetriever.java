package inhertitance.inheritancePlayGround.inheritancrePlayGround;

public class YashviGoldenRetriever extends Dog {

    private String favoriteToy;

    public YashviGoldenRetriever(String name, int age, String breed, String favoriteToy) {
        super(name, age, breed); // Call the constructor of the superclass (Dog)
        System.out.println("YashiGoldenRetriever constructor called");
        this.favoriteToy = favoriteToy;
    }

    @Override
    public void makeSound() {
        System.out.println("Yashi says: Woof! Woof! I love my " + favoriteToy + "!");
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    @Override
    public String toString(){
        return "Yashvi's favourite toy is " + getFavoriteToy();
    }

}
