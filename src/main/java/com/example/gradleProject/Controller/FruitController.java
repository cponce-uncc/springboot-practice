package com.example.gradleProject.Controller;
import com.example.gradleProject.Fruit;
import com.example.gradleProject.Repository.FruitRepository;
import com.example.gradleProject.Service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/api/fruit")
@RestController
public class FruitController {

    @Autowired
    FruitRepository fruitRepository;

    @Autowired
    FruitService fruitService;

    @PostMapping
    public void postFruit(@RequestBody Fruit fruit){
        fruitService.createFruit(fruit);

    }

    @GetMapping("/{id}")
    public Optional<Fruit> getFruit(@PathVariable Long id){
        return fruitRepository.findById(id);
    }

    @PutMapping("/{id}")
    public Optional<Fruit> updateFruit(@RequestBody Fruit newFruit, @PathVariable Long id) {

        Optional<Fruit> updatedFruit = fruitRepository.findById(id).map(fruit -> {
                    fruit.setName(newFruit.getName());
                    fruit.setColor(newFruit.getColor());
                    return fruitRepository.save(fruit);
                });

        return fruitService.getFruit(id);
    }
}
