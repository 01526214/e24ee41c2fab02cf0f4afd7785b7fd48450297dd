package at.ac.tuwien.sepm.assignment.individual.endpoint.dto;

import at.ac.tuwien.sepm.assignment.individual.entity.Breed;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

abstract public class BaseHorseDto {

    private Integer id;
    private String name;
    private String description;
    private Integer rating;
    private Date birth_date;
    private String format;
    private Breed breed;
    private LocalDateTime created;
    private LocalDateTime updated;



}
