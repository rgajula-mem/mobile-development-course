package edu.memphis.methodoverrideexample;


public class AndroidProgrammingForBeginners extends Book {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AndroidProgrammingForBeginners(String description) {
        this.description = description;
    }

    public AndroidProgrammingForBeginners(String isbn, String title, String description) {
        super(isbn, title);
        this.description = description;
    }

    @Override
    public String bookInfo() {
        return "Isbn = " + this.getIsbn()
                + ", Title = " + this.getTitle() +
                ", Description " + this.getDescription();
    }
}
