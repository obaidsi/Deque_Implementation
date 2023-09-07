package com.deque_interface;
import java.util.ArrayList;
/**
 * Tests for the {@link ArrayDeque} class.
 *
 * @see ArrayDeque
 */
public class ArrayListDequeTests extends DequeTests {
    @Override
    public <T> Deque<T> createDeque() {

        return new ArrayListDeque<>();
    }

    // You may write additional tests here if you only want them to run for ArrayDeque

}
