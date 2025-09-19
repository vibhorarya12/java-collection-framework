package ArrayListDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class Mycomparator implements Comparator<Integer> {

    @Override
    public  int compare (Integer a , Integer b ){

        return b-a;
    }


}

public class CompataorDemo {





    public static void main(String[] args){

//        List<Integer> ls = new ArrayList<>();
//        ls.add(3);
//        ls.add(4);
//        ls.add(1);
//        ls.add(8);
//
//        ls.sort((a,b)-> a-b);



//        System.out.println(ls);
// lambda functions
List<String> ls = new ArrayList<>();

        ls.add("Aircraft");
        ls.add("Spaceshuttle");
        ls.add("car");
        ls.add("Plane");
        ls.sort((a,b)->a.length() - b.length());
        System.out.println(ls);


    }
}
