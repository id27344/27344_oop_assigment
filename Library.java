package id_27344.q8;

public class Library extends Entity {
    private String libraryName;
    private String location;
    private String phoneNumber;

    public Library(int id, String createdDate, String updatedDate, String libraryName,
                   String location, String phoneNumber) {
        super(id, createdDate, updatedDate);
        if (libraryName.trim().isEmpty()) throw new LibraryDataException("Library name cannot be empty");
        if (location.trim().isEmpty()) throw new LibraryDataException("Location cannot be empty");
        if (!phoneNumber.matches("\\d{10}")) throw new LibraryDataException("Phone must be 10 digits");
        this.libraryName = libraryName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    public String getLibraryName() { return libraryName; }
    public String getLocation() { return location; }
    public String getPhoneNumber() { return phoneNumber; }
}

