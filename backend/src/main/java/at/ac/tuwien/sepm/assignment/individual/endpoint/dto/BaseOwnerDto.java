package at.ac.tuwien.sepm.assignment.individual.endpoint.dto;

import java.time.LocalDateTime;
import java.util.Objects;

abstract class BaseOwnerDto {

    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    protected BaseOwnerDto() {
    }

    public BaseOwnerDto(Long id, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseOwnerDto)) return false;
        BaseOwnerDto baseOwnerDto = (BaseOwnerDto) o;
        return Objects.equals(id, baseOwnerDto.id) &&
            Objects.equals(createdAt, baseOwnerDto.createdAt) &&
            Objects.equals(updatedAt, baseOwnerDto.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt, updatedAt);
    }

    protected String fieldsString() {
        return "id=" + id +
            ", createdAt=" + createdAt +
            ", updatedAt=" + updatedAt;
    }

    @Override
    public String toString() {
        return "BaseDto{ " + fieldsString() + " }";
    }
}
