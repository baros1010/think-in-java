package usefulcoding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DuDuXiongBuyHat{

    public static int BuyHat(ArrayList<Integer> list){
        int result = 0;
        Set<Integer> setInt = new TreeSet<Integer>();
        setInt.addAll(list);
        System.out.println(setInt);
        Iterator<Integer> iterator = setInt.iterator();
        int j=0;
        while(iterator.hasNext()&&j<3){
            result = iterator.next();
            j=j+1;
            System.out.println(result);
        }

        return result;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(20);
      list.add(10);
      list.add(10);
      list.add(20);
      list.add(40);
      list.add(60);
      list.add(60);
      list.add(50);
      list.add(100);
        System.out.println("输入数组为：");
        for(Integer li:list){
            System.out.print(li+", ");
        }
        System.out.println();
        int value = BuyHat(list);
        System.out.println("第三便宜的帽子价格："+value);
    }

}
