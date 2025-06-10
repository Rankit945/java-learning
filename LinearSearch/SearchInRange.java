public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12,34,56,57,23,78,13};
        int target = 13;
        System.out.println(my(arr,target,1,4));
        
    }
    static int my(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int index = start; index<= end; index++){
            if(target == arr[index]){
                return index;
            }

        }
        return -1;

    }
    
}