
import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String[] args){
        int[][] arr = {
            {1,2,3,},
            {34,56,78,45},
            {23,47,38,67,20},
            {12,23,46,99,90,25},                
        };
        int target = 67;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col <arr[row].length; col++){
                if(arr[row][col] == target){
                return new int[] {row, col};         
              }
            }
        }
        return new int[] {-1,-1};
    }
   
}
