import java.util.List;

public class LinkedList43 {
    public void removeFirstElement(List<String> list1){
        if(!list1.isEmpty()){
            String firstElement = list1.remove(1);

            System.out.println("ochirilgan element " + firstElement);
        }else{
            System.out.println("bosh list");
        }
    }
}
