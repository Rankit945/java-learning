import java.util.*;
public class MultiDimen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = input.nextInt();

            }
        }
        // outut 1 type
        //  for(int row = 0; row<arr.length; row++){
        //     for(int col = 0; col < arr[row].length; col++){
                
        //         System.out.print(arr[row][col] + " ");

        //     }
        //     System.out.println();
        // }
        //output 2 type
       // for(int row =0; row<arr.length; row++){
        //    System.out.println(Arrays.toString(arr[row]));
      //  }
        //output 3 type
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));

        }


    }
    
}
