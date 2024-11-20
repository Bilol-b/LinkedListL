import java.util.LinkedList;
import java.util.List;

public class LinkedList21 {
    public List<String> LinkedList21(LinkedList<String> list1) {
        list1.addFirst("last");
        list1.addLast("first");

        return list1;

//        if(!list1.isEmpty()){
//            String firstElement = ((LinkedList<String>) list1).getFirst();
//            String lastElement = list1.getLast();
//
//
//            String f = firstElement;
//            String l = lastElement;
//            List<String> list12 = new LinkedList<>();
//            list12.add(f);
//            list12.add(l);
//            return list12;
//        }


    }
//    public static void printFirstAndLast(LinkedList<String> list1){
//        if(!list1.isEmpty()){
//            String firstElement = ((LinkedList<String>) list1).getFirst();
//        }
//
//
//    }
}
