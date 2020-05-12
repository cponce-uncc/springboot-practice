package com.example.gradleProject.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.gradleProject.Fruit;

public interface FruitRepository extends JpaRepository<Fruit, Long> {

}
