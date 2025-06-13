package Static;

public class StaticExample {
    static int staticCount = 0;
    int instanceCount = 0;

    static{
        System.out.println("Static block executed");
    }

    public StaticExample(){
        System.out.println("StaticExample constructor called");
        instanceCount++;
        staticCount++;
    }
    public String toString(){
        return "{" + "instanceCount=" + instanceCount + ",staticCount=" + staticCount + '}';
    }
}