package ru.mtsb.homework.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mtsb.homework.entity.AnimalType;
import ru.mtsb.homework.repository.AnimalTypeRepository;

@Service
@RequiredArgsConstructor
public class AnimalTypeService {
    private final AnimalTypeRepository animalTypeRepository;

    public AnimalType save(AnimalType animalType) {
        return animalTypeRepository.save(animalType);
    }

    public AnimalType findById(int id) {
        return animalTypeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("***Not found animal type with id %s", id)));
    }
}
