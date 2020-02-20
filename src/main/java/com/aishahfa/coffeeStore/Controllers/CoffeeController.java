package com.aishahfa.coffeeStore.Controllers;

import com.aishahfa.coffeeStore.Models.Coffee;
import com.aishahfa.coffeeStore.Services.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @RequestMapping("/coffee")
    public List<Coffee> allCoffee(){
        return coffeeService.getAllCoffeeList();
    }

    @GetMapping("/coffee/{coffeeID}")
    public Coffee getCoffee(@PathVariable("coffeeID") Integer coffeeID){
        return coffeeService.getCoffee(coffeeID);
    }

    @PostMapping("/coffee")
    public void addCoffee(@RequestBody Coffee coffee){
        coffeeService.addCoffee(coffee);
    }

    @PutMapping("/coffee/{coffeeID}")
    public void updateCoffe(@RequestBody Coffee coffee, @PathVariable("coffeeID") Integer coffeeID){
        coffeeService.updateCoffee(coffee, coffeeID);
    }

    @DeleteMapping("/coffee/{coffeeID}")
    public void deleteCoffee(@PathVariable("coffeeID") Integer coffeeID){
        coffeeService.deleteCoffee(coffeeID);
    }
}
