package com.sukesh.functional.designPatterns;

public class TestCloneable implements  Cloneable{
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
