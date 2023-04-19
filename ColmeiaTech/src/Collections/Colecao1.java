package Collections;

import java.util.*;

public class Colecao1 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<Integer>();
        int i;

        myList.add(2);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(5);
        myList.add(3);
        myList.add(10);

        for(Integer elementsList : myList){
            System.out.println(elementsList);
        }

        System.out.println("Removendo um elemento da lista");
        System.out.println();
        myList.remove(0);

        for(Integer elementsList : myList){
            System.out.println(elementsList);
        }

        int firstElement = myList.get(0);
        System.out.println("O primeiro elemento é o: "+ firstElement);


        for (i=0; i<myList.size();i++){
            System.out.println("Elemneto: "+myList.get(i));

        }

        Collections.sort(myList);
        System.out.println("Depois de ordenado...");
        System.out.println(myList);

        Set<Integer> mySet= new HashSet<Integer>();

        mySet.add(1);
        mySet.add(5);
        mySet.add(1);
        mySet.add(9);
        mySet.add(2);
        mySet.add(5);

        Iterator<Integer> iMySet = mySet.iterator();

        while (iMySet.hasNext()){
            System.out.println(iMySet.next());
        }


    }

}
