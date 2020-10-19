package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public Book(Book anotherBook) {
        // homework
        this.title = anotherBook.title;
        this.author = anotherBook.author;
        //ids need to be same to be true copy.
        this.id = anotherBook.id;
    }

    @Override
    public boolean equals(Object obj) {
        // homework
        if(obj==null){
            return false;
        }

        if(!(obj instanceof Book)){
            return false;
        }
        Book other = (Book) obj;
        return this.id.equals(other.id);

    }
}
