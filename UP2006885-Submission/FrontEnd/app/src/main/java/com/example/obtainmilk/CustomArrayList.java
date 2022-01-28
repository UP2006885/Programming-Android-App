package com.example.obtainmilk;
import java.util.Iterator;

public class CustomArrayList<Type> implements Iterable<Type>{
    // Variables.
    private int arraySize; // Size
    private Type[] objects; // Stored Objects/Nodes.

    public CustomArrayList() { // Constructor.
        arraySize = 0;
        startSize(10);
    }
    public void startSize(int newSize) { // Sets Size when called by constructor.
        if (newSize < arraySize) return;

        Type[] old = objects;
        objects = (Type[]) new Object[newSize];
        for (int i = 0; i < size(); i++) {
            objects[i] = old[i];
        }
    }
    public int size() {
        return arraySize;
    } // Returns amt of Nodes.

    public Type get(int index) {
        if (index < 0 || index >= size()) throw new ArrayIndexOutOfBoundsException();

        return objects[index];
    }
    public boolean add(Type element) {
        add(size(), element);
        return true;
    }
    public void add(int index, Type element) {
        if (objects.length == size()) startSize(size() * 2 + 1);
        for (int i = arraySize; i > index; i--) {
            objects[i] = objects[i - 1];
        }
        objects[index] = element;
        arraySize++;
    }
    public Type remove(int index) {
        Type removeItem = objects[index];
        for (int i = index; i < size() - 1; i++) {
            objects[i] = objects[i + 1];
        }
        arraySize--;
        return removeItem;
    }

    public Iterator<Type> iterator() {
        return new ArrayListIterator();
    }
    // Inner
    private class ArrayListIterator implements java.util.Iterator<Type> {
        private int current = 0;
        public boolean hasNext() {
            return current < size();
        }
        public Type next() {
            if (!hasNext()) throw new java.util.NoSuchElementException();
            return objects[current++];
        }
        public void remove() {
            CustomArrayList.this.remove(--current);
        }
    }
}
