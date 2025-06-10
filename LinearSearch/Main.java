public class Main{
    public static void main(String[] args){
        int[] nums = {1,23,45,34,19,25,68,98};
        int target = 25;
        int ans = linearsearch(nums, target);
        System.out.println(ans);

    }
    static int linearsearch(int[] nums, int target){
        if(nums.length==0){
            return -1;
        }
        for(int index = 0; index<nums.length; index++){
          //  int element = nums[index];
            if(nums[index]== target){
                return index;
            }
        }
        return -1;
    }
}