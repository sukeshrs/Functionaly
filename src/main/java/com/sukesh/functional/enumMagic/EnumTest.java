package com.sukesh.functional.enumMagic;

public class EnumTest {
    public static void main(String[] args) {
        SingletonEnum enumValue = SingletonEnum.INSTANCE;
        SingletonEnum enumValue1 = SingletonEnum.INSTANCE;
        System.out.println(enumValue.hashCode());
        System.out.println(enumValue1.hashCode());
    }
}
