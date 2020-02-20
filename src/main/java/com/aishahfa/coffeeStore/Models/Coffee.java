package com.aishahfa.coffeeStore.Models;

import lombok.*;

@Getter
@Setter

@ToString(exclude="mlAmount")
public class Coffee {
    private Integer coffeeID;
    private String name;
    private Integer mlAmount;
    private double price;
}
