import java.util.*;
public class Main{
    public static void main(String[] args){
    //    int[] rollno = new int[5];
    //     rollno[0] = 2;
    //     rollno[1] = 5;
    //     rollno[2] = 6;
    //     rollno[3] = 9;
    //     rollno[4] = 3;
    //     for(int i = 0; i<rollno.length;i++){
    //        System.out.println(rollno[i]);
    //    }
      // System.out.println(Arrays.toString(rollno));
       // System.out.println(roolno[1]);
       // System.out.println(roolno[2]);
       // System.out.println(roolno[3]);
       // System.out.println(roolno[4]);
       Scanner input = new Scanner(System.in);
       int[] arr = new int[5]; 

       for(int i =0; i<arr.length; i++){
        arr[i] = input.nextInt();
       }
       System.out.println(Arrays.toString(arr));



    }
}