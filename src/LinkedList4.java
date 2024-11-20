import java.util.LinkedList;
import java.util.List;
public class LinkedList4 {
    public List<String> combineLists(List<String> list1,List<String> list12){
        List<String> combineteList = new LinkedList<>(list1);

        combineteList.addAll(list12);

        return combineteList;
    }
}
