package id_27344.q5;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    // Setters
    public void setId(int id) { this.id = id; }
    public void setCreatedDate(String createdDate) { this.createdDate = createdDate; }
    public void setUpdatedDate(String updatedDate) { this.updatedDate = updatedDate; }

    // Getters
    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }

    // Constructor with validation
    public Entity(int id, String createdDate, String updatedDate) {
        if (id <= 0) throw new RentalDataException("ID must be > 0");
        if (createdDate == null || createdDate.trim().isEmpty()) throw new RentalDataException("Created date cannot be empty");
        if (updatedDate == null || updatedDate.trim().isEmpty()) throw new RentalDataException("Updated date cannot be empty");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}

