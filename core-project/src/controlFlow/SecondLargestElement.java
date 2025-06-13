package controlFlow;

public class SecondLargestElement {
    public static void main(String[] args){
        int arr[] = {34,45,66,75,89,23,99};
        int Largest = arr[0];
        int SecondLargest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Largest){
                SecondLargest = Largest;
                Largest = arr[i];
            }
            else if(arr[i]>SecondLargest && arr[i] != Largest){
                SecondLargest = arr[i];
            }
        }
        System.out.println("The second largest elen=ment in the array is: " +SecondLargest);
    }
    
}
