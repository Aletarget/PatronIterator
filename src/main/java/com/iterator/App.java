package com.iterator;

import com.iterator.Iterator.Iterator;
import com.iterator.agregate.NameCollection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        NameCollection nameCollection = new NameCollection();
        nameCollection.addName("Alice");
        nameCollection.addName("Bob");
        nameCollection.addName("Charlie");
        nameCollection.addName("Diana");

        Iterator<String> iterator = nameCollection.createIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }

}
