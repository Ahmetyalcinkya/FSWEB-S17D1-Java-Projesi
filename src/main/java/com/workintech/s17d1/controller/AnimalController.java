package com.workintech.s17d1.controller;

import com.workintech.s17d1.entity.Animal;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    private Map<Integer, Animal> animals = new HashMap<>();

    @GetMapping("/")
    public List<Animal> getAllAnimals(@RequestBody Animal animal){
        animals.put(animal.getId(), animal);
        return animals.values().stream().toList();
    }
    @GetMapping("/{id}")
    public Animal getAnimal(@PathVariable int id){
        return animals.get(id);
    }
    @PostMapping("/")
    public void addAnimal(@RequestBody int id, String name){
       Animal animal = new Animal(id, name);
       animals.put(id, animal);
    }
    @PutMapping("/{id}")
    public void updateAnimal(@PathVariable int id, @RequestBody Animal animal){
        animals.put(id, new Animal(id, animal.getAnimalName()));
    }
    @DeleteMapping("/{id}")
    public Animal deleteAnimal(@PathVariable int id){
        return animals.remove(id);
    }
}
