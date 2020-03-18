package at.ac.tuwien.sepm.assignment.individual.endpoint.dto;

import java.time.LocalDateTime;
import java.util.Objects;

public class OwnerOwnerDto extends BaseOwnerDto {

    private String name;

    public OwnerOwnerDto() {
    }

    public OwnerOwnerDto(String name) {
        this.name = name;
    }

    public OwnerOwnerDto(Long id, String name, LocalDateTime created, LocalDateTime updated) {
        super(id, created, updated);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OwnerOwnerDto)) return false;
        if (!super.equals(o)) return false;
        OwnerOwnerDto ownerDto = (OwnerOwnerDto) o;
        return Objects.equals(name, ownerDto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    @Override
    protected String fieldsString() {
        return super.fieldsString() + ", name='" + name + '\'';
    }

    @Override
    public String toString() {
        return "OwnerDto{ " + fieldsString() + " }";
    }
}
