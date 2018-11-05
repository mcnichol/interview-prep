package com.mcnichol.interviewing.datastructure;

public class Stack<T> {
    private T[] sarray;
    private int TOP = 0;

    @SuppressWarnings("unchecked")
    Stack() {
        this.sarray = (T[]) new Object[10];
    }

    public boolean isEmpty() {
        return (TOP == 0);
    }

    public void push(T value) {
        if (isFull()) {
            grow();
        }

        sarray[TOP++] = value;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is already empty, nothing to pop.");
        }

        return sarray[--TOP];
    }

    public boolean isFull() {
        return (TOP == sarray.length);
    }

    public T peek() {
        return sarray[TOP - 1];
    }

    public int size() {
        return TOP;
    }

    @SuppressWarnings("unchecked")
    private void grow() {
        T[] tempArray = (T[]) new Object[sarray.length*2];
        System.arraycopy(sarray, 0, tempArray, 0, sarray.length);
        sarray = tempArray;
    }
}
