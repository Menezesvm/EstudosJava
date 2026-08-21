package generics;


import java.util.List;

public class Util {
    public static <T extends Comparable<T>> T major(List<T> lista) {
        T majorNow = lista.get(0);
        for (T item : lista) {
            if (item.compareTo(majorNow) > 0) {
                majorNow = item;
            }
        }
        return majorNow;
    }
}
