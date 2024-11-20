import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist1 {
    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("white");
        list1.add("yellow");
        list1.add("black");
        list1.add("red");

        printListWithIterator(list1);

        System.out.println("Listdagi toplamlar soni " + list1.size());

//        list1.clear();


        //2 mashq uchun
        LinkedList2 processor = new LinkedList2();
        List<String> revers = processor.LinkedList2(list1);
        System.out.println("Teskari tartibdagis " + revers);

        LinkedList21 processor1 = new LinkedList21();
        List<String> revers1 = processor1.LinkedList21(list1);
        System.out.println("boshi va oxiriga element qoshish " + revers1);

        printFirstAndLast(list1);

        //3 mashq uchun
        LinkedList3 processor3 = new LinkedList3();
        List<String> revers3 = processor3.LinkedList3(list1);
        System.out.println(revers3);

        LinkedList32 processor32 = new LinkedList32();
        processor32.removeFirstAndLast(list1);


        //4 mashq uchun
        List<String> list12 = new LinkedList<>();
        list12.add("one");
        list12.add("two");

        LinkedList4 processor4 = new LinkedList4();
        List<String> combinedList = processor4.combineLists(list1, list12);
        System.out.println("birlashgani " + combinedList);
        //yoki
        list1.addAll(list12);
        System.out.println("birlashgan 2" + list1);

        LinkedList42 processor42 = new LinkedList42();
        List<String> changeList = processor42.LinkedList42(list1);
        System.out.println("almashgani " + changeList);

        LinkedList43  processor43 = new LinkedList43();
        processor43.removeFirstElement(list1);

        System.out.println("qolganlari " + list1);

        //5 mashq uchun

        LinkedList5 processor5 = new LinkedList5();
        processor5.linkedList5(list1);
        System.out.println("aralashgani " + list1);

        LinkedList51 processor51 = new LinkedList51();
        List<String> alist = processor51.LinkedList51(list1);
        System.out.println("arraylist " + alist);

        LinkedList52 processor52 = new LinkedList52();
        processor52.sortList(list1);

        System.out.println("");




    }
    public static void printListWithIterator(LinkedList<String> list1){
        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
    }

    public static void printFirstAndLast(LinkedList<String> list1){
        if(!list1.isEmpty()){
            String firstElement = list1.getFirst();
            String lastElement = list1.getLast();

            System.out.println("birinchisi " + firstElement + " oxirgisi " + lastElement);
        }else{
            System.out.println("bosh list ");
        }
    }
}
