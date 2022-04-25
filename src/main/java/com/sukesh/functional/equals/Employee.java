package com.sukesh.functional.equals;

import java.util.Objects;

public class Employee {
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public void setName(String name) {
        this.name = name;
    }

}
