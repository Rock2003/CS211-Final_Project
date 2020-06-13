import java.util.*;
public class Client {

   public static void main(String[] args) {
      SortedList<Integer> list = new SortedList<Integer>();
         // test(list);
         processListI(list);
   }
   public static void test(SortedList<Integer> list) {
   
      list.add(5);
       list.add(3);
       list.add(50);
       list.add(-5);
       
       System.out.println(list);
      System.out.println(list.indexOf(3));
       list.remove(2);
       System.out.println(list);
       list.add(2);
       System.out.println(list);
       list.add(2);
       System.out.println(list);
   }
   public static void processListI(SortedList<Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
        System.out.printf("\nList: %s\n", list);
        System.out.printf("size(): %s\n", list.size());
        System.out.printf("contains(30): %s\n", list.contains(30));
        System.out.printf("contains(15): %s\n", list.contains(15));
        System.out.printf("isEmpty(): %s\n", list.isEmpty());
        System.out.printf("indexOf(40): %s\n", list.indexOf(40));
        System.out.printf("indexOf(60): %s\n", list.indexOf(60));
        System.out.printf("get(1): %s\n", list.get(1));

        list.remove(1);
        System.out.printf("remove(1): %s\n", list);

        list.add(50);
        System.out.printf("add(50): %s\n", list);
        
        List<Integer> otherList = new ArrayList<Integer>();
        otherList.add(100);
        otherList.add(200);
        otherList.add(300);
       
        System.out.printf("Other List: %s\n", otherList);
        list.addAll(otherList);
        System.out.printf("addAll(otherList): %s\n", list);
        
        list.clear();
        System.out.printf("clear(): %s\n", list);
        System.out.printf("isEmpty(): %s\n\n\n", list.isEmpty());
    }
}