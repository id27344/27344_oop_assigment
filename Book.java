package id_27344.q8;

public class Book extends Section {
    private String title;
    private String author;
    private String ISBN;

    public Book(int id, String createdDate, String updatedDate, String libraryName, String location, String phoneNumber,
                String sectionName, String sectionCode, String title, String author, String ISBN) {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode);
        if (title.trim().isEmpty()) throw new LibraryDataException("Book title cannot be empty");
        if (author.trim().isEmpty()) throw new LibraryDataException("Author cannot be empty");
        if (ISBN.length() < 10) throw new LibraryDataException("ISBN must be ≥ 10 characters");
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
}

