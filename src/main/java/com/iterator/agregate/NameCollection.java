package com.iterator.agregate;

import java.util.ArrayList;
import java.util.List;

import com.iterator.Iterator.IterableCollection;
import com.iterator.Iterator.Iterator;
import com.iterator.IteratorConcreto.*;

public class NameCollection implements IterableCollection<String> {
    private List<String> names = new ArrayList<>();

    public void addName(String name) {
        names.add(name);
    }

    @Override
    public Iterator<String> createIterator() {
        return new NameIterator(names);
    }
}
