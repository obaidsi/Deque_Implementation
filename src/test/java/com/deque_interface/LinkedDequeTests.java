package com.deque_interface;

public class LinkedDequeTests extends DequeTests{
    @Override
    public <T> Deque<T> createDeque(){
        return new LinkedDeque<>();
    }
}
