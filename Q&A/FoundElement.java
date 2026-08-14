//Q1. Find an element. int[] arr = {10, 25, 30, 45, 50}; Find the index of 45 using Linear Search.
public class FoundElement{
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50};
        int target = 45;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Element found at index of: " + i);
                return;
            }
        }
        System.out.println("Element not found.");
    }
}