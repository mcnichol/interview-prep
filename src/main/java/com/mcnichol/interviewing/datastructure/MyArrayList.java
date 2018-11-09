package com.mcnichol.interviewing.datastructure;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<E> implements List<E> {

    private E[] elements;
    private int size;

    public MyArrayList() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public MyArrayList(int initialCapacity) {
        elements = (E[]) new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public boolean add(E value) {
        if (full()) {
            grow();
        }
        elements[size++] = value;

        return false;
    }

    private void grow() {
        @SuppressWarnings("unchecked")
        E[] bigger = (E[]) new Object[elements.length * 2];

        System.arraycopy(elements, 0, bigger, 0, size);
        elements = bigger;
    }

    private boolean full() {
        return this.size == elements.length;
    }

    public void add(int index, E element) {
        checkRange(index);

        if (full()) {
            grow();
        }

        elements[size++] = elements[index];
        elements[index] = element;
    }

    public boolean addAll(Collection<? extends E> c) {
        int inputSize = c.size();
        checkCapacity(inputSize);

        @SuppressWarnings("unchecked")
        E[] a = (E[]) c.toArray();

        System.arraycopy(a, 0, elements, this.size, inputSize);

        this.size += inputSize;

        return false;
    }

    private void checkCapacity(int inputSize) {
        if (elements.length - this.size < inputSize) {
            grow();
        }
    }

    public boolean addAll(int index, Collection c) {
        return false;
    }

    public void clear() {

    }

    public boolean contains(Object value) {
        for (Object element : elements) {
            if (value == element) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection collectionToCheckFor) {
        if (collectionToCheckFor.size() > size) {
            return false;
        }

        int sizeOfCopiedElements = size;
        Object[] customArrayElementsCopy = new Object[sizeOfCopiedElements];
        System.arraycopy(elements, 0, customArrayElementsCopy, 0, sizeOfCopiedElements);

        for (Object elementToCheckFor : collectionToCheckFor) {
            for (int i = 0; i < sizeOfCopiedElements; i++) {
                if (customArrayElementsCopy[i].equals(elementToCheckFor)) {
                    customArrayElementsCopy[i] = customArrayElementsCopy[sizeOfCopiedElements - 1];
                    customArrayElementsCopy[sizeOfCopiedElements - 1] = null;
                    sizeOfCopiedElements--;
                    break;
                }
            }
        }

        return sizeOfCopiedElements <= 0;
    }

    public E remove(int index) {
        return null;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public E get(int index) {
        checkRange(index);

        return elements[index];
    }

    public E set(int index, Object element) {
        return null;
    }

    public Iterator<E> iterator() {

        return null;
    }

    public ListIterator<E> listIterator() {
        return null;
    }

    public ListIterator<E> listIterator(int index) {
        return null;
    }

    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public <T> T[] toArray(T[] a) {
        return a;
    }

    public int indexOf(Object object) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    private void checkRange(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }
    }
}
