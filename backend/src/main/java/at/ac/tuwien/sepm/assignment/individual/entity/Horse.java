package at.ac.tuwien.sepm.assignment.individual.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Horse extends HorseBaseEntiy {

    private String name;
    private String description;
    private Integer rating;
    private Date birth_date;
    private String format;
    private Breed breed;

    public Horse() {

    }

    public Horse(Integer id, String name, String description, Integer rating, Date birth_date, String format, Breed breed, LocalDateTime created, LocalDateTime updated) {
        super(id, created, updated);
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.birth_date = birth_date;
        this.format = format;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(name, horse.name) &&
            Objects.equals(description, horse.description) &&
            Objects.equals(rating, horse.rating) &&
            Objects.equals(birth_date, horse.birth_date) &&
            Objects.equals(format, horse.format) &&
            breed == horse.breed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, description, rating, birth_date, format, breed);
    }

    @Override
    protected String fieldsString() {
        return super.fieldsString() + ", name='" + name + '\'';
    }

    @Override
    public String toString() {
        return "Horse{ " + fieldsString() +" }";
    }




}
