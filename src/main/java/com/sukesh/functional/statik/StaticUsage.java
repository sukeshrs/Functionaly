package com.sukesh.functional.statik;

public class StaticUsage {
    public static void main(String[] args) {
        StaticSuper.printRubbish();
        StaticChild.printRubbish();
        StaticChild.printRubbish();
        StaticChild.printRubbish();
        StaticChild.printRubbish();
        StaticSuper super1 = new StaticSuper();
        StaticSuper superr = new StaticSuper();
        super1.printMoreRubbish();
        superr.printMoreRubbish();
        super1.printMoreRubbish();
        superr.printMoreRubbish();
        super1.printMoreRubbish();
        superr.printMoreRubbish();
        super1.printMoreRubbish();
        superr.printMoreRubbish();

    }
}
