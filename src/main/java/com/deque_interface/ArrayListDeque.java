package com.deque_interface;
import java.util.ArrayList;

public class ArrayListDeque<T> implements Deque<T>{
    private final ArrayList<T> list;

    public ArrayListDeque(){
        this.list = new ArrayList<T>();
    }

    @Override
    public void addFirst(T item) {
        // TODO Auto-generated method stub
        list.add(0, item);
    }

    @Override
    public void addLast(T item) {
        // TODO Auto-generated method stub
        list.add(item);
    }

    @Override
    public T get(int index) {
        if(index>list.size()-1 || index<0){ return null;}
        // TODO Auto-generated method stub
        return list.get(index);
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
       return list.size();
    }

    @Override
    public T removeFirst() {
        if(list.size()==0){return null;}
        // TODO Auto-generated method stub
        return list.remove(0);
    }

    @Override
    public T removeLast() {
        if (list.size()==0){return null;}
        // TODO Auto-generated method stub
        return list.remove(list.size()-1);
    }
}
