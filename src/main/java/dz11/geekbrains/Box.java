package dz11.geekbrains;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Box<T extends Fruits> {
    private LinkedList<T> fruits;

    public LinkedList<T> getFruits() {
        return fruits;
    }

    public Box(T obj) {
        fruits = new LinkedList<>();
    }

    public double getWeight() {
        if (fruits.size() == 0) return 0;
        return fruits.size() * fruits.get(0).getWeight();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    boolean compare(T obj) {
        return this.getWeight() == obj.getWeight();
    }

    void toBox(Box<T> obj) {
        obj.fruits.addAll(this.fruits);
        this.fruits.removeAll(fruits);
    }
}