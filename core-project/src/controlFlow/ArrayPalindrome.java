package controlFlow;

public class ArrayPalindrome {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1};
        int flag = 0;

        for (int i=0;i<arr.length/2;i++){
            if(arr[i] != arr[arr.length-1-i]){
                flag = 1;
                break;
            }
        }

        if(flag == 0){
            System.out.println("Array is a palindrome");
        }
        else{
            System.out.println("Array is not a palindrome");
        }   

    }
}
