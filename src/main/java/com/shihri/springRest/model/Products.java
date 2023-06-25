package com.shihri.springRest.model;

import java.util.Objects;

public class Products {

    String name;
    String cost;

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Objects.equals(name, products.name) && Objects.equals(cost, products.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
