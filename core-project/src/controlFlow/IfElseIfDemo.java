package controlFlow;
      //Failed(<40), Passed(40-60), Good(60-80), Excellent(80-100)


public class IfElseIfDemo {
    public static void main(String args[]){ 
        int overallPercentage = 75;
        
        if(overallPercentage<40){
            System.out.println("Failed");
        }
        else if(overallPercentage>=40 && overallPercentage<=60){
            System.out.println("Passed");
        }
        else if(overallPercentage>=60 && overallPercentage<=80){
            System.out.println("Good");
        }
        else if(overallPercentage > 80 && overallPercentage <= 100){
            System.out.println("Excellent");
        } 
        else{
          System.out.println("Invalid");
        }
    }
}
