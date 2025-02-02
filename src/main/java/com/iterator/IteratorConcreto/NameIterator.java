package com.iterator.IteratorConcreto;

import java.util.List;

import com.iterator.Iterator.Iterator;

public class NameIterator implements Iterator<String> {
    private List<String> names;
    private int position = 0;

    public NameIterator(List<String> names) {
        this.names = names;
    }

    @Override
    public Boolean hasNext() {
        return position < names.size();
    }

    @Override
    public String next() {
        if (this.hasNext()) {
            return names.get(position++);
        }
        return null;
    }
}
