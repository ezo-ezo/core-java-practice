package controlFlow;

public class FrequencyInArray {
    public static void main(String[] args) {
        int arr[] = {23,24,34,56,23,56,76,76,43};
        
        for(int i=0;i<arr.length;i++){
            int repeat = 0;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    repeat = 1;
                    break;
                }
            }

            if(repeat == 0){
                int count = 1;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }
                System.out.println(arr[i] + " appears " + count + " times");
            }
        }
        
    }
}
