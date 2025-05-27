
import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
      //String message = greeting();
       //ystem.out.println(message);
       Scanner input = new Scanner(System.in);
       String name = input.next();
       String personal = mygreet(name);
       System.out.println(personal);


    }
     static String mygreet(String name){
        String greet = "hello " + name;
        return greet;
     }

    static String greeting(){
        String greet = "how are you";
        return greet;
    }
    
}
