package controlFlow;

public class Print_1_to_5 {
    public static void main(String[] args){
        System.out.println("Using for loop:");

        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        System.out.println("Using while loop:");
        int i = 1;

        while(i <= 5){
            System.out.println(i);
            i++;
        }

        System.out.println("Using do-while loop:");
        i = 1;

        do{
            System.out.println(i);
            i++;
        } while(i <= 5);
    }
}
