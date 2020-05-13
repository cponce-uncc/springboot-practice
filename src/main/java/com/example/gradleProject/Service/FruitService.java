package com.example.gradleProject.Service;

import com.example.gradleProject.Fruit;
import com.example.gradleProject.Repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FruitService {

    @Autowired
    FruitRepository fruitRepository;

    // Create
    public void createFruit(Fruit fruit){
        fruitRepository.save(fruit);
    }

    // Read
    public Optional<Fruit> getFruit(Long id){
        return fruitRepository.findById(id);
    }

    // Update
    public Optional<Fruit> updateFruit(Long id){
        return fruitRepository.findById(id);
    }

    // Delete
    public void deleteFruit(Long id){
        fruitRepository.deleteById(id);
    }

}
