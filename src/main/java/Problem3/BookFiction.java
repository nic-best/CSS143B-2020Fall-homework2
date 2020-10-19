package Problem3;

public class BookFiction extends Book {

    private int lateFeePerDayInDollar = 2;

    private String genres;

    public BookFiction(String title, String author, String genres) {
        // homework
        // tip: use the 'super' keyword
        super(title, author);
        this.genres = genres;
    }

    // copy constructor
    public BookFiction(BookFiction anotherBook) {
        // homework
        // tip: use the 'super' keyword
        super(anotherBook.title, anotherBook.author);
        this.genres = anotherBook.genres;
        //ids need to be same to be true copy.
        this.id = anotherBook.id;
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // homework
        //if we arent past due, then we dont charge customer
        if(numOfDaysPastDue<0){
            return 0;
        }
        return numOfDaysPastDue*lateFeePerDayInDollar;
    }
}
