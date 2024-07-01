package ru.mtsb.homework.entity;

import javax.persistence.*;

import lombok.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(schema = "animals", name = "animal")
public class Animal {
    @Id
    private int id;
    private String name;
    private String breed;
    private double cost;
    private String character;
    private String secretInfo;
    @ManyToOne()
    @JoinColumn(name = "type_id")
    private AnimalType animalType;


    @Override
    public String toString() {
        return "Animal{" +
                "animalType=" + animalType +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", cost=" + cost +
                ", character='" + character + '\'' +
                ", secretInfo='" + secretInfo + '\'' +
                '}';
    }
}
