package id_27344.q3;

public class Entity {

    private int id;
    private String createdDate;
    private String updatedDate;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) { this.createdDate = createdDate; }

    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) { this.updatedDate = updatedDate; }

    // Constructor with validation
    public Entity(int id, String createdDate, String updatedDate) {
        if (id <= 0) throw new PayrollDataException("ID must be greater than 0.");
        if (createdDate == null || createdDate.trim().isEmpty()) throw new PayrollDataException("Created date cannot be empty.");
        if (updatedDate == null || updatedDate.trim().isEmpty()) throw new PayrollDataException("Updated date cannot be empty.");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}


