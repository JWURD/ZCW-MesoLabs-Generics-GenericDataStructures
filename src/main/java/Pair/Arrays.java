package Pair;

import java.util.ArrayList;
import java.util.Collections;

/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
 */
public class Arrays {
    public static <E> Pair<E> firstLast(ArrayList<E> a) {
        E t1 = a.get(0);
        E t2 = a.get(a.size() - 1);
        Pair<E> thePair = new Pair<E>(t1, t2);
        return thePair;
    }

    public static <E> Pair<E> minMax(ArrayList<E> a) {
        Pair<E> pair = new Pair<E>(min(a), max(a));
        return pair;
    }

    public static <E> E min(ArrayList<E> a) {
        E temp = null;
        E min = null;
        Pair<E> thePair;
        for (int i = 0; i < a.size() - 1; i++) {
            thePair = new Pair<E>(a.get(i), a.get(i + 1));
              temp = thePair.min();
              
        }
        return min;
    }

    public static <E> E max(ArrayList<E> a) {

        E max = null;
        Pair<E> thePair;
        for (int i = 0; i < a.size() - 1; i++) {
            thePair = new Pair<E>(a.get(i), a.get(i + 1));
            max = thePair.min();
        }
        return max;
    }

}
