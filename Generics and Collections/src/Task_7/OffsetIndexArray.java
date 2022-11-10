package Task_7;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OffsetIndexArray<T> extends AbstractList<T> {
    List<T> list = new ArrayList<>();
    int from, to;

    OffsetIndexArray(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public T get(int index) {
        return list.get(index - from);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void add(int index, T element) {
        if (index >= from || index <= to)
            list.add(index, element);
    }

    @Override
    public boolean add(T t) {
        if (size() < to - from + 1) {
            list.add(t);
            return true;
        }

        return false;
    }

    @Override
    public T set(int index, T element) {
        return list.set(index - from,  element);
    }

    @Override
    public T remove(int index) {
        return list.remove(index - from);
    }

    @Override
    public int indexOf(Object o) {
        return list.indexOf(o) + from;
    }

    @Override
    public int lastIndexOf(Object o) {
        return list.lastIndexOf(o) + from;
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < size(); i++) {
            str += list.get(i) + ", ";
        }
        str += "]";

        return str;
    }
}
