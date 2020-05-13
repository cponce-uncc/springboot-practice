package com.example.gradleProject;

import com.example.gradleProject.Repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    FruitRepository fruitRepository;

    @Override
    public void run(String... args) throws Exception {

        fruitRepository.save(new Fruit("red", "apple"));
        fruitRepository.save(new Fruit("blue", "blueberries"));
        fruitRepository.save(new Fruit("yellow", "banana"));
    }
}
