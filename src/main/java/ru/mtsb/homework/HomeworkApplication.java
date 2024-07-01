package ru.mtsb.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import ru.mtsb.homework.entity.Animal;
import ru.mtsb.homework.entity.AnimalType;
import ru.mtsb.homework.service.AnimalService;
import ru.mtsb.homework.service.AnimalTypeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class HomeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeworkApplication.class, args);
	}

	@Autowired
	private AnimalService animalService;
	@Autowired
	private AnimalTypeService animalTypeService;

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			animalService.save(Animal.builder()
					.id(5)
					.name("Simona")
					.breed("Tiger Shark")
					.cost(25000d)
					.character("Vigorous")
					.secretInfo("Secret Shark")
					.animalType(animalTypeService.findById(1))
					.build()
			);

			List<Animal> list = animalService.findAll();

			for(Animal animal : list) {
				System.out.println(animal);
			}

			for(Animal animal : list) {
				System.out.println(animal);
			}
			List<Animal> Croco = animalService.findByName("Barsik");
			Croco.stream().forEach(System.out::println);
		};

	}
}

