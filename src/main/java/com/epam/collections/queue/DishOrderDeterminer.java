package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DishOrderDeterminer {

    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> dishes = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }
        List<Integer> eatenDishes = new ArrayList<>();
        int index = everyDishNumberToEat - 1;
        while (!dishes.isEmpty()) {
            eatenDishes.add(dishes.remove(index));
            if (!dishes.isEmpty()) {
                index = (index + everyDishNumberToEat - 1) % dishes.size();
            }
        }
        return eatenDishes;
    }
}