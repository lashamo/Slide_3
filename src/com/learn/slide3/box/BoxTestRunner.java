package com.learn.slide3.box;

public class BoxTestRunner {

    public static void main(String[] args) {
        Box box = new Box();
        box.width = 10.5;
        box.length = 11;
        box.height = 3;
        System.out.println("ყუთის მოცულობა " + box.volume());
        System.out.println("ყუთში ჩაეტევა " + box.capacity(1000) + " წყალი");
        box.printInfo();

        Box box2 = new Box(5, 10.3, 4);
        box2.printInfo();
    }
}
