package com.learn.slide3.encapsulation.box;

public class BoxTestRunner {

    public static void main(String[] args) {
        Box box = new Box(10.5, 11, 3);

        box.setWidth(10);
        System.out.println("ყუთის სიგრძე არის " + box.getWidth());

        System.out.println("ყუთის მოცულობა " + box.volume());
        System.out.println("ყუთში ჩაეტევა " + box.capacity(1000) + " წყალი");
        box.printInfo();

        Box box2 = new Box(5, 10.3, 4);
        box2.printInfo();
    }
}
