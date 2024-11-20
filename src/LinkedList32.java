import  java.util.LinkedList;
import java.util.List;
public class LinkedList32 {
        public void removeFirstAndLast(LinkedList<String> list1){
            if(!list1.isEmpty()){
                String firstRemove = list1.removeFirst();
                String lastRemove = list1.removeLast();

                System.out.println("birnchic " + firstRemove + " oxirgisis " + lastRemove);
            }else{
                System.out.println("bosht list !!!!!!!");
            }
        }
}
