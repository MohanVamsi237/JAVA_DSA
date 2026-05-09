package linkedlist;
import java.util.*;
class coll_SLL{
    public static void main(){
        LinkedList<String> list=new LinkedList<>();

        list.addLast("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");                   
        list.add("last");                        // same as List.addLast
        System.out.println(list);  

        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);
        list.remove("is");
        System.out.println(list);
        list.remove();
        System.out.println(list);
    }
}