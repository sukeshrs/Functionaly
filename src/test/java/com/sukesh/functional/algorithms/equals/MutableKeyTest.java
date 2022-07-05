package com.sukesh.functional.algorithms.equals;

import com.sukesh.functional.equals.MutableKey;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class MutableKeyTest {
    @Test
    public void shouldTestIfTheKeyIsMutable(){
        MutableKey key = new MutableKey("initial");
        Map<MutableKey , String> map = new HashMap<>();
        map.put(key , "test");
        key.setName("another");
        assertNull(map.get(key));
        MutableKey key1 = new MutableKey("initial1");
        MutableKey key2 = new MutableKey("initial2");
        MutableKey key4 = new MutableKey("initial3");
        MutableKey key5 = new MutableKey("initial4");


        System.out.println(  (key.hashCode() & Integer.MAX_VALUE) % 8);
        System.out.println(  (key1.hashCode() & Integer.MAX_VALUE) % 8);
        System.out.println(  (key2.hashCode() & Integer.MAX_VALUE) % 8);
        System.out.println(  (key4.hashCode() & Integer.MAX_VALUE) % 8);
        System.out.println(  (key5.hashCode() & Integer.MAX_VALUE) % 8);
       System.out.println(0xfffffff);
        System.out.println(Integer.MAX_VALUE);
    }
}
