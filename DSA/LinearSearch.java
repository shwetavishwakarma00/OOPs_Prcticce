public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {10,25,30,45,50};
        int target = 30;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.err.println("Element found at index: "+ i);
                return;
            }
        }
        System.err.println("Element not found");
    }
}