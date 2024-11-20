import java.util.Collections;
import java.util.List;

public class LinkedList52 {
    public void sortList(List<String> list1){
        if(!list1.isEmpty()){
            Collections.sort(list1);

            System.out.println("ochirilgan element " + list1);
        }else{
            System.out.println("bosh list");
        }
    }
}
