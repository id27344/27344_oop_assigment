package id_27344.q8;

public class Section extends Library {
    private String sectionName;
    private String sectionCode;

    public Section(int id, String createdDate, String updatedDate, String libraryName,
                   String location, String phoneNumber, String sectionName, String sectionCode) {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber);
        if (sectionName.trim().isEmpty()) throw new LibraryDataException("Section name cannot be empty");
        if (sectionCode.length() < 3) throw new LibraryDataException("Section code must be ≥ 3 chars");
        this.sectionName = sectionName;
        this.sectionCode = sectionCode;
    }

    public String getSectionName() { return sectionName; }
    public String getSectionCode() { return sectionCode; }
}

