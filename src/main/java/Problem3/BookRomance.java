package Problem3;

public class BookRomance extends Book {

    private int lateFeePerDayInDollar = 4;

    public BookRomance(String title, String author) {
        // homework
        // tip: use the 'super' keyword
        super(title, author);
    }

    public BookRomance(BookRomance anotherBook) {
        // homework
        // tip: use the 'super' keyword
        super(anotherBook.title, anotherBook. author);
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
