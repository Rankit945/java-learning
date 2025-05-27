import java.util.Scanner;

public class Sum {
    public static void main(String []args){
       // sum();
        //int ans = sum2();
        //System.out.println(ans);
        int ans = sum3(40,50);
        System.out.println(ans);

    }
    static int sum3(int a, int b){
    int sum = a+b;
    return sum;
    }

    static int sum2(){
         Scanner input = new Scanner(System.in);
         int num1, num2, sum;
         num1 = input.nextInt();
         num2 = input.nextInt();
         sum = num1 + num2;
         return sum;
    }
    static void sum(){
     Scanner input = new Scanner(System.in);
        int num1, num2, sum;
         num1 = input.nextInt();
         num2 = input.nextInt();
         sum = num1 + num2;
        System.out.println("Sum = "+sum);
    }
}
