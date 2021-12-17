package dz11.geekbrains;

public class Main {
    public static void main(String[] args) {
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> box = new Box(orange) ;
        System.out.println(orange.getWeight());
        box.add(new Orange());
        box.add(new Orange());
        Box<Orange>box1 = new Box<>(orange);

        Box<Apple> box2 = new Box(apple);
        System.out.println(box.getFruits().size() + 1);
        box.toBox(box1);
        box1.add(new Orange());
        System.out.println(box.getFruits().size() + " " + (box1.getFruits().size() + 1));
    }
}
