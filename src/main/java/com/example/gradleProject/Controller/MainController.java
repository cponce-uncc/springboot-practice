package com.example.gradleProject.Controller;
import com.example.gradleProject.Fruit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MainController {

    Fruit myApple = new Fruit("red", 23, "apple");
    Fruit myPapaya = new Fruit("yellow", 24, "papaya");
    ArrayList<Fruit> myFruitList = new ArrayList<>();

    @GetMapping("/hello")  // Pointed to "/hello" (/) is home
    public String getHello(){
        return "hello world";
    }

    // Returning strings and pointing
    @GetMapping("/name")  // Pointed to "/name"
    public String getName(){  // Can pass back any object, not just String (JSON)
        return "My name is Cristian";
    }

    // Returning objects
    @GetMapping("/fruit")
    public Fruit getApple(){
        return myApple;
    }

    // Returning a list of objects
    @GetMapping("/all-fruit")
    public ArrayList<Fruit> getFruitArrayList() {
        myFruitList.add(myApple);
        myFruitList.add(myPapaya);
        return myFruitList;
    }

}
