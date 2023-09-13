package com.deque_interface;

import java.util.LinkedList;

class LinkedDeque<T> implements Deque<T> {
    private Node<T> front;
    private Node<T> back;
    private int size;

    public LinkedDeque(){
        size = 0;
        back = new Node<T>(null);
        front = new Node<T>(null, null, back);
        back.prev = front;
    }

    @Override
    public void addFirst(T item) {
        // TODO Auto-generated method stub
        Node<T> newNode = new Node<T>(item, front, front.next);
        front.next.prev = newNode;
        front.next = newNode; 
    }

    @Override
    public void addLast(T item) {
        // TODO Auto-generated method stub
        Node<T> newNode = new Node<T>(item, back.prev, back);
        back.prev.next = newNode;
        back.prev = newNode;

    }

    @Override
    public T get(int index) {
        // TODO Auto-generated method stub
        if(index>size || index<0){ return null;}

        Node<T> current = front;
        for (int i=0; i<index; i++){
            current = current.next;
        }
        return current.value;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public T removeFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFirst'");
    }

    @Override
    public T removeLast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeLast'");
    }

    private static class Node<T>{
        public final T value;
        public Node<T> prev;
        public Node<T> next;

        public Node(T value){
            this(value, null, null);
        }

        public Node(T value, Node<T> prev, Node<T> next){
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public String toString(){
            return "Node{"+"value="+ value + "}";
        }
    }
}