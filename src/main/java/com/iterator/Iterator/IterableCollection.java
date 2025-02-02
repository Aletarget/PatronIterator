package com.iterator.Iterator;

public interface IterableCollection<T> {
    Iterator<T> createIterator();
}
