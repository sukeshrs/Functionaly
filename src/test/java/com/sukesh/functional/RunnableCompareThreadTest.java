package com.sukesh.functional;

import com.sukesh.functional.threads.RunnableCompare;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RunnableCompareThreadTest{

    private static final String ID1 = "id1";
    private static final String INSTANCE1 = "instance1";
    private static final String INSTANCE2 = "instance2";

    RunnableCompare instance1;
    RunnableCompare instance2;

    private Map<String , Runnable> runnableMap = new HashMap();
    private Map<String , List<Runnable>> listOfTasksMap = new HashMap();

    @Before
    public void setUp(){
        instance1 = new RunnableCompare();
        instance2 = new RunnableCompare();
        runnableMap.put(INSTANCE1 , instance1);
        runnableMap.put(INSTANCE2, instance2);
        Stream<Runnable> stream = Stream.of(instance1 , instance2);
        List<Runnable> listOfTasks = getArrayListFromStream(stream);
        listOfTasksMap.put("id1" , listOfTasks);
    }


    @Test
    public void itComparesTwoRunnable(){
        assertNotEquals(instance1 , instance2);
    }

    @Test
    public void compareRunnableFromTheMap(){
        Runnable runnable = runnableMap.get(INSTANCE2);
        Thread t = new Thread(runnable);
        t.start();
        assertEquals(instance2 , runnable);
    }

    public void compareAndRemoveRunnable(){
      List<Runnable> returnedList = listOfTasksMap.get(ID1).stream().filter(t -> t.equals(instance1)).collect(Collectors.toList());
      Assertions.assertEquals(1, returnedList.size());
      Assertions.assertEquals(instance2 , returnedList.get(0));
    }

    private <T> List<T> getArrayListFromStream(Stream<T> stream){
       return stream.collect(Collectors.toList());
    }


}
