package ru.mtsb.homework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mtsb.homework.entity.Animal;
import ru.mtsb.homework.repository.AnimalRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    public List<Animal> findAll(){
        return animalRepository.findAll();
    }

    public Animal save(Animal animal) {
       return animalRepository.saveAndFlush(animal);
    }

    public void delete(Animal animal){
        animalRepository.delete(animal);
    }

    public List<Animal> findByName(String name) {
        return animalRepository.findAnimalsByName(name);
    }


}
