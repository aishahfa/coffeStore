package com.aishahfa.coffeeStore.Services;

import com.aishahfa.coffeeStore.Models.Coffee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CoffeeService {
    private List<Coffee> CoffeeList = new ArrayList<>(Arrays.asList());

    //view all coffee list
    public List<Coffee> getAllCoffeeList(){
        return CoffeeList;
    }

    //view certain coffee based on coffeeID
    public Coffee getCoffee(Integer coffeeID) {
        return CoffeeList.stream()
                .filter(coffee -> coffee.getCoffeeID().equals(coffeeID)).findFirst().get();
    }

    //add new coffee
    public void addCoffee(Coffee coffee) {
        CoffeeList.add(coffee);
    }

    //update details
    public void updateCoffee(Coffee coffee, Integer coffeeID){
        int count = 0;
        for(Coffee coffeeUpdate: CoffeeList){
            if(coffeeUpdate.getCoffeeID().equals(coffeeID)){
                CoffeeList.set(count, coffee);
            }
            count++;
        }
    }

    //delete coffee
    public void deleteCoffee(Integer coffeeID){
        CoffeeList.removeIf(coffee -> coffee.getCoffeeID().equals(coffeeID));
    }

}
