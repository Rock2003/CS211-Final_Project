import java.util.*;
public class Client {

   public static void main(String[] args) {
      SortedList<Integer> list = new SortedList<Integer>();
       list.add(5);
       list.add(3);
       list.add(50);
       list.add(-5);
       
       System.out.println(list);
      System.out.println(list.indexOf(3));
       list.remove(2);
       System.out.println(list.indexOf(2));
   }
}