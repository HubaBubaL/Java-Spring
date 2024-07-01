package ru.mtsb.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mtsb.homework.entity.AnimalType;

public interface AnimalTypeRepository extends JpaRepository<AnimalType, Integer> {
}
