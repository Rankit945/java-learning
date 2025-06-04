import java.util.*;
public class ColNoFixed {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(3);
        Scanner input = new Scanner(System.in);

        // list.add(67);
        // list.add(34);
        // list.add(78);
        // list.add(69);
        // list.add(35);
        // list.add(79);

        // System.out.println(list.contains(67));
        // System.out.println(list.contains(56));

        // System.out.println(list);

        // list.set(0,99);
        // list.remove(2);
        // System.out.println(list);
        
        for(int i = 0; i<5; i++){
            list.add(input.nextInt());
        }

          for(int i = 0; i<5; i++){
           System.out.println(list.get(i));
         }
      //  System.out.println(list);



    }
}
