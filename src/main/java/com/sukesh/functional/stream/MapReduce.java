package com.sukesh.functional.stream;

import com.sukesh.functional.Person;
import com.sukesh.functional.util.CommonUtil;

import java.util.List;

public class MapReduce {
    public static void main(String[] args) {
       List<Person> people = CommonUtil.returnPersonList();
       people.stream()
               .map(person -> person.getAge())
               .filter(age -> age >20)
               .forEach(System.out::println);
    }
}
