package at.ac.tuwien.sepm.assignment.individual.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

abstract public class HorseBaseEntiy {

    private Integer id;
    private String name;
    private String description;
    private Integer rating;
    private Date birth_date;
    private String format;
    private Breed breed;
    private LocalDateTime created;
    private LocalDateTime updated;

    public HorseBaseEntiy(){

    }

    public HorseBaseEntiy(Integer id, LocalDateTime created, LocalDateTime updated){

    }

    public HorseBaseEntiy(Integer id, String name, String description, Integer rating, Date birth_date, String format, Breed breed, LocalDateTime created, LocalDateTime updated) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.birth_date = birth_date;
        this.format = format;
        this.breed = breed;
        this.created = created;
        this.updated = updated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HorseBaseEntiy)) return false;
        HorseBaseEntiy horseBaseEntiy = (HorseBaseEntiy) o;
        return Objects.equals(id, horseBaseEntiy.id) &&
            Objects.equals(name, horseBaseEntiy.name) &&
            Objects.equals(description, horseBaseEntiy.description) &&
            Objects.equals(rating, horseBaseEntiy.rating) &&
            Objects.equals(birth_date, horseBaseEntiy.birth_date) &&
            Objects.equals(format, horseBaseEntiy.format) &&
            breed == horseBaseEntiy.breed &&
            Objects.equals(created, horseBaseEntiy.created) &&
            Objects.equals(updated, horseBaseEntiy.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, rating, birth_date, format, breed, created, updated);
    }

    protected String fieldsString() {
        return "id=" + id +
            ", name=" + name +
            ", description=" + description +
            ", rating=" + rating +
            ", birth_date=" + birth_date +
            ", format=" + format +
            ", birth_date=" + birth_date +
            ", breed=" + breed +
            ", created=" + created +
            ", updated=" + updated;
    }

    @Override
    public String toString() {
        return "HorseBaseEntiy{ " + fieldsString() + " }";
    }
}
